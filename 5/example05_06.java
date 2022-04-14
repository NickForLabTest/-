class e05_06
{
    private int max,min;
    e05_06()
    {
        min=0;
        max=0;
    }
    e05_06(int a)
    {
        max=a>=0? a:0;
        min=a<=0? a:0;   
        
    }
    e05_06(int a,int b)
    {
        if(a==b)
        {
            min=a;
            max=b;
        }
        else
        {
        min=a<b? a:b;
        max=a>b? a:b;
        }
    }
    public void value(int a,int b)
    {
        if (a==b)
        {
            this.min=a;
            this.max=b;
        }
        else
        {
        this.min=a<b? a:b;
        this.max=a>b? a:b;
        }
    }
    public void value(int a)
    {
        max=a>=0? a:0;
        min=a<=0? a:0;   
    }
    public void getvalue()
    {
        System.out.println("min="+min+"\n"+"max="+max);
    }
}

class example05_06
{
    public static void main(String args[])
    {
        e05_06 test1=new e05_06();
        test1.value(-20,-5);
        test1.getvalue();
        e05_06 test2=new e05_06();
        test2.value(-20);
        test2.getvalue();
        e05_06 test3=new e05_06();
        test3.getvalue();
        e05_06 test4=new e05_06(23);
        test4.getvalue();
        e05_06 test5=new e05_06(30,41);
        test5.getvalue();
    }
}


