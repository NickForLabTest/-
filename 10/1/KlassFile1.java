import java.io.*;
public class KlassFile1
{
    public static void main(String[] args) {
        try { // Создание файла в текущей папке (где расположен файл KlassFile1.java)
            File f1=new File("MyFile1.txt");
            f1.createNewFile(); 
            if (f1.exists()) {
                System.out.println("File created!");
                System.out.println("Full path 1: "+ f1.getAbsolutePath());
            }
            File f2=new File("E:\\MyFile2.txt");
            System.out.println( "Full path 2: "+ f2.getAbsolutePath());
            // Создание нескольких вложенных папок
            File f3=new File("E:\\Papka1\\Papka2\\Papka3"); f3.mkdirs();
            System.out.println("Full path 3: "+ f3.getAbsolutePath());
            } 
        catch (Exception e) { System.out.println("Error! "+e);}
        }
}