import java.util.Scanner;
public class example02_02{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        int number=InCMD.nextInt();
        if(number%5==2 && number%7==1) System.out.println("Number fulfil condition");
        else{
            System.out.println("Number don't fulfil condition:");
            System.out.println("Remainder of division by 5:" +number%5);
            System.out.println("Remainder of division by 7:" +number%7);
    }
}
}