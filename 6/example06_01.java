class e06_01
{
    char a;
    String b;
    e06_01(char aa)
    {
        a=aa;
    }
    e06_01(String bb)
    {
        b=bb;
    }
    e06_01(char arr[])
    {
        if(arr.length==1)
        a=arr[0];
        else
        {
            b="";
            for(int i=0;i<arr.length;i++)
            b+=""+arr[i];
        }
    }
    void output()
    {
        System.out.println("char: "+a+"\n"+"String: "+b);
    }
}

class example06_01
{
    public static void main(String args[])
    {
        e06_01 test1=new e06_01("Test");
        test1.output();
        System.out.println("--------");
        e06_01 test2=new e06_01('h');
        test2.output();
        System.out.println("--------");
        char array[]={'H','E','L','L','O'};
        e06_01 test3=new e06_01(array);
        test3.output();
        System.out.println("--------");
        char array1[]={'H'};
        e06_01 test4=new e06_01(array1);
        test4.output();
    }
}