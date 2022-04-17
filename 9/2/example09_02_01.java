import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Scanner;
public class example09_02_01
{
    public static void add(ArrayList <Integer> check) throws  InputMismatchException
    {
        int number=0;
            try{
            Scanner InCMD=new Scanner(System.in);
            number=InCMD.nextInt();
            check.add(number);
            }
            catch (InputMismatchException e) {
                throw new InputMismatchException();
             }
    }
    public static void positive_check(ArrayList <Integer> check) throws Exception
    {
        boolean positive=false;
        for(var h : check) if(h>=0) positive=true;
        if(positive==false) throw new Exception();
    }
    public static void main(String args[])
    {
        ArrayList <Integer> test=new ArrayList<Integer>();
        Scanner InCMD=new Scanner(System.in);
        System.out.println("Please, fulfil array with 5 numbers");
       for(int i=0;i<5;)
       {
           try{
           add(test);
           i++;
           if(i==5) positive_check(test);
           }
           catch (InputMismatchException e) {
               System.out.println("Wrong input!. You enter string or float value! Try again!");
            }
            catch (Exception a) {
                
                {System.out.println("Positive number does not exist!"); break;}
               }
       }
       System.out.println("Array contains next number:");
       for(var h : test) System.out.print(" "+h);  
}
}