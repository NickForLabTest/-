import java.util.Scanner;
public class example01_09{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        String Name;
        int age;
        System.out.print("Enter name:");
        Name=InCMD.nextLine();
        System.out.print("Enter age:");
        age=InCMD.nextInt();
        System.out.print("You name is " +Name);
        System.out.print(" and you age is " +age);
        InCMD.close();
    }
}
