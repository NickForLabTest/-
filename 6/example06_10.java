class example06_10
{
    static int[] test(int...a)
    {
        int min=a[0],max=0;
        for(int i: a)
        {
            if(i<min) min=i;
            if(i>max) max=i;
        }
        int b[]={max,min};
        return b;
    }
    public static void main(String args[])
    {
        System.out.println("Numbers:");
        System.out.println("2,3,1,6,8,2");
        for(int i: test(2,3,1,6,8,2))
        System.out.print(i+" ");
    }
}