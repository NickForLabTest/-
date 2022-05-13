import java.io.*;
import java.util.Scanner;
public class RandFtxt{
    public static void main(String[] args) {
        try
        {
            File folder=new File("E:\\My");
            if (!folder.exists()) folder.mkdir();
            File f1=new File("E:\\My\\strokiRand.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.print("How many string write into file? \n => ");
            int count = sc.nextInt();
            sc.nextLine();
            RandomAccessFile rf = new RandomAccessFile(f1, "rw");
            rf.setLength(0);
            long len=rf.length();
            System.out.println("Open file with size of "+len+ " byte");
            System.out.println("Input strings:");
            int kol=0;
            for (int i = 0; i < count; i++) {
                String s=sc.nextLine();
                rf.writeUTF(s);
                kol+=s.length();
            }
            len=rf.length();
            System.out.println("Size file in byte = "+len);
            rf.close();
            rf = new RandomAccessFile(f1, "r");
            System.out.println("String from file:");
            rf.seek(0);
            for (int i = 0; i < count; i++) System.out.println("String " + i +" start with byte " + rf.getFilePointer() +" - " + rf.readUTF() +" - end with byte "+ (rf.getFilePointer()-1));
            rf.close();
        }
        catch (IOException e) {System.out.println("Error "+e);}
    }
}