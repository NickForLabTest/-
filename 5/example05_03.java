class e05_03{
    public int first,second;
    e05_03()
    {
        first=1;
        second=1;
    }
    e05_03(int a)
    {
        first=a;
        second=1;
    }
    e05_03(int a,int b)
    {
        first=a;
        second=b;
    }
}

class example05_03{
    public static void main(String args[])
    {
        e05_03 test1=new e05_03();
        System.out.println("Without argument:"+"\n"+"test1.first="+test1.first+"\n"+"test1.second="+test1.second);
        e05_03 test2=new e05_03(2);
        System.out.println("With 1 argument:"+"\n"+"test2.first="+test2.first+"\n"+"test2.second="+test2.second);
        e05_03 test3=new e05_03(2,2);
        System.out.println("With 2 argument:"+"\n"+"test3.first="+test3.first+"\n"+"test3.second="+test3.second);
    }

}