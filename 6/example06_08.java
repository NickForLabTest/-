class example06_08
{
    static double average(int a[])
    {
        double average=0.0;
        for(int i:a)
        average+=i;
        return average/a.length;
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        System.out.println("Array:");
        for(int i: array)
        System.out.print(i+" ");
        System.out.println("");
        System.out.println(average(array));

    }
}