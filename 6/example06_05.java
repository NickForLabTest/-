import java.util.Scanner; 
class example06_05
{
    static int sum(int a)
    {
        if(a<=1) return 1;
        int sum=0;
        for(int i=1; i<=a;i++)
        {
            sum+=i*i;
        }
        return sum;
    }
    static int sum_recur(int a)
    {
        int sum=0;
        if(a<=1) return 1;
        sum=sum_recur(a-1) +(a*a);
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("Enter any number:");
        Scanner InCMD=new Scanner (System.in);
        int i=InCMD.nextInt();
        System.out.println("For method:");
        System.out.println(sum(i));
        System.out.println("Recursion method:");
        System.out.println(sum_recur(i));
    }
}