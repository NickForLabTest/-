class e06_03
{
    int a[];
    e06_03(int...v)
    {
        a=v;
    }
    void output()
    {
        System.out.println("Array number's:");
        for(int i: a)
        System.out.print(i+" ");
        System.out.print("\n");
    }
    void bigger()
    {
        int big=0;
        for(int i: a)
        if(i>big) big=i;
        System.out.println("Max: "+big);
    }
    void smaller()
    {
        int smaller=a[0];
        for(int i: a)
        if(i<smaller) smaller=i;
        System.out.println("Min: "+smaller);
    }
    void average()
    {
        double average=0.0;
        for(int i: a)
        average+=i;
        System.out.println("Average: "+average/a.length);
    }
}

class example06_03
{
    public static void main(String args[])
    {
        int array[]={2,3,1,4};
        e06_03 test1=new e06_03(4,6,1);
        test1.output();
        test1.bigger();
        test1.smaller();
        test1.average();
        System.out.println("-------");
        e06_03 test2=new e06_03(array);
        test2.output();
        test2.bigger();
        test2.smaller();
        test2.average();
    }
}