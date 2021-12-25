import java.util.Scanner;
public class example01_12{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        System.out.println("Press you birth_year");
        int Birth_Year = InCMD.nextInt();
        Birth_Year=2021-Birth_Year;
        System.out.println("You age is: " +Birth_Year);
        InCMD.close();
    }
}