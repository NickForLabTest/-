import java.util.Scanner;
public class example01_13{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        System.out.println("Enter you name");
        String Name=InCMD.nextLine();
        System.out.println("Enter you age");
        int Age=InCMD.nextInt();
        System.out.print("You are " +Name);
        System.out.print(" and you age is " +Age);
        InCMD.close();

    }
}