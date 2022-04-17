import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Scanner;
public class example09_02_01_without
{
    public static void main(String args[])
    {
        ArrayList <Integer> test=new ArrayList<Integer>();
        System.out.println("Please, fulfil array with 5 numbers");
        for(int i=0;i<5;)
        {
            try
            {
                Scanner InCMD=new Scanner(System.in);
                int number=0;
                number=InCMD.nextInt();
                test.add(number);
                i++;
                if(i==5)
                {
                    boolean positive=false;
                    for(var h : test) if(h>=0) positive=true;
                    if(positive==false) throw new Exception();
                }
            }
            catch (InputMismatchException e) {System.out.println ("You input string or float number! Try again!");}
            catch (Exception e) {System.out.println("Positive number does not exist!");break;}
        }
        for(var h: test) System.out.print(" "+h);
    }
}