import java.util.Scanner;
class example06_04
{
    static int fac(int a)
    {
    int fact=1;
    for(;a>=2;a-=2)
    {
        fact*=a;
    }
    return fact;
    }
    static int fac_recur(int a)
    {
        //int result;
        if(a<2) return 1;
        //result = fac_recur(a-2) *a;
        return fac_recur(a-2) *a;
    }
    public static void main(String args[])
    {
        Scanner InCMD=new Scanner(System.in);
        int i= InCMD.nextInt();
        System.out.println("For method:");
        System.out.println(fac(i));
        System.out.println("Recursion method:");
        System.out.println(fac_recur(i));
    }
}