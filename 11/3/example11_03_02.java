import java.io.*;
import java.util.Scanner;
public class example11_03_02
{
    public static void main(String args[]) throws ClassNotFoundException, IOException
    {
        File f2=new File("output.txt");
        if(!f2.exists()) f2.createNewFile();
        new PrintWriter("output.txt").close();
        PrintWriter out=new PrintWriter("output.txt");
        try 
        {
        Scanner InCMD=new Scanner(System.in);
        System.out.println("Input amount of film for writing to file:");
        int count=InCMD.nextInt();
        InCMD.nextLine();
        File f1=new File("input.txt");
        if(!f1.exists()) f1.createNewFile();
        new PrintWriter(f1).close();
        FileOutputStream fos=new FileOutputStream(f1);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        for(int i=0;i<count;i++)
        {
        System.out.println("Input information about "+(i+1)+" film");
        movie check = new movie ();
        System.out.println("Input film name");
        check.name=InCMD.nextLine();
        System.out.println("Input film country");
        check.country=InCMD.next();
        System.out.println("Input film genre");
        check.type=InCMD.next();
        System.out.println("Input film date");
        check.date=InCMD.next();
        System.out.println("Input film cost");
        check.cost=InCMD.nextInt();
        InCMD.nextLine();
        oos.writeObject(check);
        }
        oos.close();
        FileInputStream fis=new FileInputStream(f1);
        ObjectInputStream oin=new ObjectInputStream(fis);
        // new PrintWriter("output.txt").close();
        // PrintWriter out=new PrintWriter("output.txt");
        while(true)
        {
            
            movie check=(movie)oin.readObject();
            if(check.country.toLowerCase().equals("russia"))
            {
                out.println("Name: " +check.name);
                out.println("Country: "+ check.country);
                out.println("Type: "+ check.type);
                out.println("Date: "+ check.date);
                out.println("Cost: "+ check.cost);
                out.println("--------------");
            }
        }
        }
        catch (EOFException e) {System.out.println("End of file");out.close();}
        catch (IOException e) {System.out.println("Error: "+e);}
    }
}