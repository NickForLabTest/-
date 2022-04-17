import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class example09_02_03
{
    public static void add( ArrayList <Byte> check) throws Exception
    {
        Scanner InCMD=new Scanner(System.in);
        Byte i=InCMD.nextByte();
        int sum=0;
        check.add(i);
        try
        {
        for(Byte h: check)
        {
            sum+=h;
        }
        }
        catch (InputMismatchException e) {throw new InputMismatchException();}
        if(sum>=128 || sum<=-128) {
            check.remove(check.size()-1);
            throw  new Exception ("Sum of array out of bounds");}

    }
    public static void main(String args[])
    {
        ArrayList <Byte> test=new ArrayList<Byte>();
        while(true)
        {
            try
            {
                add(test);
            }
            catch (InputMismatchException e) {System.out.println("Enter wrong input type!");}
            catch (Exception e) {System.out.println(e);break;}
        }
        System.out.println("You array:");
        for(Byte h: test)
        {
            System.out.print(" "+h);
        }
    }   
}