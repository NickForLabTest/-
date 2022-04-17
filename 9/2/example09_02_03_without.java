import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class example09_02_03_without
{
    public static void main(String args[])
    {
        ArrayList <Byte> test=new ArrayList<Byte>();
        while(true)
        {
            try
            {
                Scanner InCMD=new Scanner(System.in);
                Byte i=InCMD.nextByte();
                int sum=0;
                test.add(i);
                for(Byte h: test)
                {
                    sum+=h;
                }
                if(sum>=128 || sum<=-128) {
                    test.remove(test.size()-1);
                    throw  new Exception ("Sum of array out of bounds");}
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