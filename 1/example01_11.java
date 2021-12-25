import java.util.Scanner;
public class example01_11{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        String Mounth;
        int day;
        System.out.println("Enter mounth");
        Mounth=InCMD.nextLine();
        System.out.println("Enter day");
        day=InCMD.nextInt();
        System.out.print(Mounth);
        System.out.print(" "+day);
        InCMD.close();
    }
}