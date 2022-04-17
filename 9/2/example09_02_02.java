import java.util.InputMismatchException;
import java.util.Scanner;
public class example09_02_02
{
    public static void show(int[][] check) throws ArrayIndexOutOfBoundsException, InputMismatchException
    {
            try{
            Scanner InCMD=new Scanner(System.in);
            int i=0;
            i=InCMD.nextInt();
            for(int row=0;row<3;row++)
            {
                System.out.println(check[row][i]);
            }
        }
        catch(InputMismatchException e) {throw new InputMismatchException();}
        catch (ArrayIndexOutOfBoundsException e) {throw new ArrayIndexOutOfBoundsException();}

    }
    public static void main(String args[])
    {
        int number=0;
        int [][] test=new int [3][3];
        for(int row=0;row<3;row++)
        {
            for(int column=0;column<3;column++)
            {
             test[row][column]=number++;
            }
        }
        System.out.println("You have next 2d array:");
        for(int h[]:test)
        {
            for(int t:h)
            {
                System.out.print(" "+t);
            }
        System.out.println("");
        }
        while(true)
        {
            try
            {
                show(test);
            }
            catch(InputMismatchException e) {System.out.println("You input string or float value! Try again!");}
            catch(ArrayIndexOutOfBoundsException a) {System.out.println("Column with this number does not exist!");}
        }
}
}