import java.io.*;
import java.net.*;
public class Primer1
{
    public static void readAllByByte(InputStream in) throws IOException
    {
        while(true)
        {
            int oneByte = in.read();
            if(oneByte!=-1) System.out.print((char)oneByte);
            else {System.out.println("\n"+"end");break;}
        }
    }
    public static void main(String args[]) throws IOException
    {
        try{
        InputStream inFile=new FileInputStream("c:/tmp/text.txt");
        readAllByByte(inFile);
        System.out.println("\n");
        inFile.close();
        
        // InputStream inURL = new URL("http://google.com").openStream();
        // readAllByByte(inURL);
        // System.out.println("\n");
        // inURL.close();

        InputStream inArray = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
        readAllByByte(inArray);
        System.out.println("All");
        inArray.close();

    }
    catch (IOException e) {System.out.println("Error:"+e);}
    }
}