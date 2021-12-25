import java.util.Scanner;
public class example02_01{
    public static void main(String args[])
    {
        Scanner InCMD=new Scanner(System.in);
        int number=InCMD.nextInt();
        if(number%3==0) System.out.println("Number divide to 3 without remnant");
        else  System.out.println("Number divide to 3 with remnant:" +number%3);
    }
}