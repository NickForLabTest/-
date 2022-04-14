import java.util.Scanner;
class example06_06
{
    static int[] test(int a[],int b)
    {
        int c[]=(b>=a.length)? new int[a.length]: new int [b];
        if(b>=a.length)
        {
            for(int i=0;i<a.length;i++)
            c[i]=a[i];
        }
        else
        {
            for(int i=0;i<b;i++)
            c[i]=a[i];
        }
        return c;
        
    }
    public static void main(String args[])
    {
        Scanner InCMD=new Scanner(System.in);
        int array[]={1,2,3,4,5,6,7,8};
        System.out.println("Array:");
        for(int i : array)
        System.out.print(i+" ");
        System.out.println("");
        int number=InCMD.nextInt();
        for(int i : test(array,number))
        System.out.print(i+" ");
    }
}
