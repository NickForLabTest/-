import java.util.ArrayList;
import java.io.*;
public class example11_2
{
    public static void main(String args[])
    {
        
        BufferedReader br=null;
        PrintWriter out=null;
        try
        {
            br=new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            new PrintWriter("output.txt").close();
            out=new PrintWriter("output.txt");

            String s;
            int line=1,count=0;
            ArrayList <String> end= new ArrayList<String>();
            while((s=br.readLine())!=null)
            {

                String[] arr=s.split(" ",0);
                char letter =arr[0].charAt(0);
                for(var h:arr) {
                    if(h.charAt(0)==letter)
                    {
                        out.println(h+" line-"+line);
                        count++;
                    }
            
                }
                end.add(line +" line contain "+count+" word");
                count=0;
                line++;

            }
            for(var h:end)
            {
                out.println(h);
            }
        }
        catch (IOException e) {System.out.println(e);}
        finally
        {
            try
            {
                br.close();
                out.close();
            }
            catch (IOException e) {System.out.println("Can't close file"+e);}
        }
    }
}