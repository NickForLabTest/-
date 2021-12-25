import java.util.Scanner;
public class example01_17{
    public static void main(String args[]){
        Scanner InCMD= new Scanner (System.in);
        int First,Second;
        System.out.println("Press first number");
        First=InCMD.nextInt();
        System.out.println("Press second number");
        Second=InCMD.nextInt();
        System.out.println("Sum of two number is: "+(First+Second));
        System.out.println("Difference of two number is: "+(First-Second));
        InCMD.close();
    }
}