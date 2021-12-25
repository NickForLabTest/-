import java.util.Scanner; 
public class example02_06{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        int number = InCMD.nextInt();
        String check= Integer.toOctalString(number);
        System.out.println("Octal number:" +check);
        if(check.length()>1) System.out.println(check.charAt(check.length()-2));
        else System.out.println("Octal number less than 10");

    }
}