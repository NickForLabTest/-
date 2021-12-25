import java.util.Scanner;
import java.util.jar.Attributes.Name;
public class example01_10{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        String Name_Day, Mounth;
        int Day;
        System.out.println("Enter name day");
        Name_Day=InCMD.nextLine();
        System.out.println("Enter mounth");
        Mounth=InCMD.nextLine();
        System.out.println("Enter day");
        Day=InCMD.nextInt();
        System.out.print(Name_Day);
        System.out.print(" "+Mounth);
        System.out.print(" "+Day);
        InCMD.close();
    }
}