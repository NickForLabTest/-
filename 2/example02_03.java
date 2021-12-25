import java.util.Scanner; 
public class example02_03{
    public static void main(String atgs[])
    {
        Scanner InCMD=new Scanner(System.in);
        int number=InCMD.nextInt();
        if(number/4>1 && number>=10) System.out.println("Number fulfil condition");
        else
        {
            System.out.println("Number don't fulfil condition:");
            System.out.println("Number divided by 4:"+number/4);
            if(number<10) System.out.println("Number less than 10");

        }
    }
}