import java.util.Scanner;
public class example01_14{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        System.out.println("Press you age");
        int Age=InCMD.nextInt();
        Age=2021-Age;
        System.out.println("You birth year is "+Age);
        InCMD.close();
    }
}