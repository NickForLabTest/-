import java.io.*;
public class File_RW_byByte
{
    public static void main(String args[]) throws IOException
    {
        Reader in=null; 
        Writer out=null;
        try
        {
            in = new FileReader("E:\\MyFile1.txt");
            out= new FileWriter("E:\\MyFile2.txt", true);
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1)
            {
                // out.write((char)oneByte); // запись с уничтожением ранее существующих данных
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        }
        catch (IOException e) {System.out.println("Error: "+e);}
        finally
        {
            in.close();
            out.close();
        }
    }
}