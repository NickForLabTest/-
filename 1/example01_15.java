import java.util.Scanner;
public class example01_15{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        System.out.println("Enter first number");
        int number=InCMD.nextInt();
        System.out.println("Enter second number");
        number=number+InCMD.nextInt();
        System.out.println("Sum of two number is "+number);
        InCMD.close();
    }
}