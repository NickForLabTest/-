import java.util.Scanner;

public  class example08_02{
    static String bitwise(int check)
    {
        String result ="";
        
        if (check==0) return "0";
        if(check==1) return "1";
        // return bitwise(check%2);
        result=bitwise(check/2) +check%2;

        return result;
    }
    public static void main(String args[])
    {
        Scanner InCMD= new Scanner(System.in);
        int number=InCMD.nextInt();
        System.out.print(bitwise(number));

    }
}