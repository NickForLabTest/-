import java.util.Scanner;
public class example01_16{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        int Number;
        System.out.println("Press number");
        Number=InCMD.nextInt();
        System.out.print(Number-1);
        System.out.print(" "+Number);
        System.out.print(" "+(Number+1));
        System.out.print(" "+((Number-1)+(Number)+(Number+1))*((Number-1)+(Number)+(Number+1)));
    }
}