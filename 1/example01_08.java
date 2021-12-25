import java.util.Scanner;
public class example01_08{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        String FirstName,SecondName,ThirdName;
        System.out.print("Input First name:");
        FirstName=InCMD.nextLine();
        System.out.print("Input Second name:");
        SecondName=InCMD.nextLine();
        System.out.print("Input Third name:");
        ThirdName=InCMD.nextLine();
        System.out.print(FirstName);
        System.out.print(" "+SecondName);
        System.out.print(" "+ThirdName);
        InCMD.close();

    }
}