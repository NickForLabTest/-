import java.util.Scanner; 
public class example02_04{
    public static void main(String args[])
    {
        Scanner InCMD=new Scanner(System.in);
        int number=InCMD.nextInt();
        if(number<=10 && number>=5)System.out.println("Number fulfil condition");
        else System.out.println("Number don't fulfil condition");
    
    }

}