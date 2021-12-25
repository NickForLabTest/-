import java.util.Scanner; 
public class example02_05{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        int number = InCMD.nextInt();
        System.out.println("Amount of thousands:"+number/1000);
    }
}