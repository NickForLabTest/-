import java.util.Scanner;
import java.io.*;
public class Files_byteRW_my2
{
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Input filename ");
            String fname=sc.nextLine();
            try{
                File f1=new File(fname);
                f1.createNewFile();
                System.out.println("Full path to file: "+ f1.getAbsolutePath());
                System.out.print("Input amount of string to write into file => ");
                int n=sc.nextInt();
                DataOutputStream dOut= new DataOutputStream( new FileOutputStream(f1));
                sc.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.print("Input string to write into file=> ");
                     String s=sc.nextLine();
                     dOut.writeUTF(s );
                }
                dOut.flush(); 
                dOut.close();
                DataInputStream dIn=new DataInputStream(new FileInputStream(f1));
                 while (true) {

                    System.out.println(dIn.readUTF());
                    }
            }
            catch (IOException e) {System.out.println(e);}
        }
    }
