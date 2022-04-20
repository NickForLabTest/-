import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class example10_2 
{
    public static void main(String args[]) throws IOException
    {
        new FileOutputStream("output.txt").close();
        FileOutputStream fout=new FileOutputStream("output.txt",true);
        List <String> Lines = new ArrayList<String>();
        Lines = Files.readAllLines(Paths.get("input.txt"));
        fout.write(Lines.get(1).getBytes());
        fout.write(10);
        for(int i=2;i<7;i++)
        {
            
            double test = Double.parseDouble(Lines.get(i));
            System.out.println(test);
            if (test>=0.0)
            {
            // byte[] str=Lines.get(i).getBytes();
             fout.write(Lines.get(i).getBytes());
             fout.write(10);
            }
        }
        fout.close();
   
    }
}