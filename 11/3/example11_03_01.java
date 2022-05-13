import java.util.Scanner;
import java.io.*;
import java.nio.charset.*;
public class example11_03_01
{
    public static void main(String args[]) throws IOException
    {
        try
        {
        File f1=new File("input.txt");
        if(!f1.exists()) f1.createNewFile();
        new PrintWriter(f1).close();
        RandomAccessFile rf=new RandomAccessFile(f1, "rw");
        Scanner sc=new Scanner(System.in,"UTF-8");
        System.out.println("Input amount of film for writing to file:");
        int amount=sc.nextInt();
        sc.nextLine();
        String film_name,film_country,film_genre,film_date;
        int film_cost;
        for(int i=0;i<amount;i++)
        {
            System.out.println("Input information about "+(i+1)+" film");
            System.out.println("Input film name");
            System.out.println(rf.getFilePointer());
            film_name=sc.nextLine();
            rf.writeUTF(film_name);
            for(int d=0;d<18-film_name.length();d++)
            {
                rf.writeByte(1);
            }
            System.out.println(rf.getFilePointer());
            System.out.println("Input film country");
            film_country=sc.next();
            rf.writeUTF(film_country);
            for(int d=0;d<18-film_country.length();d++)
            {
                rf.writeByte(1);
            }
            System.out.println(rf.getFilePointer());
            System.out.println("Input film genre");
            film_genre=sc.next();
            rf.writeUTF(film_genre);
            for(int d=0;d<18-film_genre.length();d++)
            {
                rf.writeByte(1);
            }
            System.out.println(rf.getFilePointer());
            System.out.println("Input film date");
            film_date=sc.next();
            rf.writeUTF(film_date);
            for(int d=0;d<18-film_date.length();d++)
            {
                rf.writeByte(1);
            }
            System.out.println(rf.getFilePointer());
            System.out.println("Input film cost");
            film_cost=sc.nextInt(); 
            rf.writeInt(film_cost);
            sc.nextLine();
        }
        // rf=new RandomAccessFile(f1, "r");
        // rf.seek(0);
        System.out.println(rf.length());
        

        // rf.seek(22);
        // String check=rf.readUTF();
        // System.out.println(check+"-"+check.length());
        
        // System.out.println(rf.readUTF()+rf.getFilePointer());
        // System.out.println(rf.readUTF()+ rf.getFilePointer());
        // System.out.println(rf.readUTF()+rf.getFilePointer());
        // StringBuffer buffer = new StringBuffer();
        // while(rf.getFilePointer()<rf.length())
        // {
        //     buffer.append(rf.readLine()+System.lineSeparator());
        // }
        // String content = buffer.toString();
        // System.out.println(content);
        rf.close();
        rf=new RandomAccessFile(f1, "r");
        new PrintWriter("output.txt").close();
        PrintWriter out=new PrintWriter("output.txt");
        rf.seek(0);
        for(int i=0;i<rf.length();i+=84)
        {
            rf.seek(i+20);
            String country = rf.readUTF();
            country=country.toLowerCase();
            System.out.println(country);
            System.out.println(rf.getFilePointer());
            if(country.equals("russia"))
            {
                rf.seek(i);
                out.println("Name: "+ rf.readUTF());
                rf.seek(i+20);
                out.println("Country: "+ rf.readUTF());
                rf.seek(i+40);
                out.println("Genre: " + rf.readUTF());
                rf.seek(i+60);
                out.println("Date: "+ rf.readUTF());
                rf.seek(i+80);
                out.println("Cost: "+ rf.readInt());
                out.println("---------------");
            } 

        }
        rf.close();
        out.close();
    }
    catch (IOException e) {System.out.println("Error: "+e);}
        }
}  
