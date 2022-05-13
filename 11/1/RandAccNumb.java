import java.util.Scanner;
import java.io.*;
public class RandAccNumb{
    public static void main(String[] args) {
        try
        {
            File folder = new File("E:\\My");
            if (!folder.exists()) folder.mkdir();
            File f1 = new File("E:\\My\\num1Mart.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            System.out.print("How many number write into file? \n => ");
            int count = sc.nextInt();
            RandomAccessFile rf = new RandomAccessFile(f1, "rw");
            System.out.println("Original size of file in byte = " + rf.length() + ", pointer is on  " + rf.getFilePointer() + "-m byte");
            System.out.println("Input numbers:");
            for (int i = 0; i < count; i++) {
                rf.writeInt(sc.nextInt());
            }
            System.out.println("New size of file =" + rf.length() + ", pointer is on " + rf.getFilePointer() + "-m byte");
            System.out.println("Amount byte on  1 number = " + rf.length() / count);
            rf.close();
            rf = new RandomAccessFile(f1, "r");
            System.out.println("\n Numbers in file:");
            for (int i = 0; i < count; i++) {
                rf.seek(i * 4);
                System.out.println("Number" + i + ": " + rf.readInt());
            }
            System.out.println("Numbers in reverse order:");
            for (int i = count - 1; i >= 0; i--) {
                rf.seek(i * 4);
                System.out.println("Number" + i + ": " + rf.readInt());
            }
            rf.seek(rf.getFilePointer() - 4);
            System.out.println(" Amount numbers in file= " + rf.length()/4 + ", last number= " + rf.readInt());
            System.out.print("\n Enter the number to be found in file  => ");
            int x = sc.nextInt();
            int kol = 0;
            for (int i = 0; i < count; i++) {
                rf.seek(i * 4);
                int number = rf.readInt();
                if (number == x) {
                    kol++;
                    System.out.print("Number " + i+ "," );
                }
            }
            System.out.println(" Amount searched number = " + kol);
            rf.close();
            rf = new RandomAccessFile(f1, "rw");
            for (int k = 0; k < count; k++) { 
                for (int i = 0; i < count - k -1; i++){
                    rf.seek(i * 4); 
                    int number1 = rf.readInt();
                    int number2 = rf.readInt();
                    if (number1 > number2) {
                        rf.seek(i * 4); 
                        rf.writeInt(number2); 
                        rf.writeInt(number1);
                    }
                }
            }
            System.out.println("\n Sorted numbers");
            for (int i = 0; i < count; i++) {
                rf.seek(i * 4);
                System.out.print(" " + rf.readInt());
            }
            rf.close();
        }
        catch (IOException e) {System.out.println("Error: "+e);}
    }
}