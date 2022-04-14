class e06_02
{
    static private int a=0;
    static void show()
    {
        System.out.println(a);
        a++;
    }
}

class example06_02
{
    public static void main(String args[])
    {
        e06_02 test1=new e06_02();
        for(int i=0;i<5;i++)
        test1.show();
    }
}