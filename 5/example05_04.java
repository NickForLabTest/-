import java.lang.Math; 
class e05_04
{
    public char a;
    public int b;
    e05_04(char first,int second)
    {
        a=first;
        b=second;
    }
    e05_04(double first)
    {
        a=(char)first;
        b=(int) Math.floor((first-(int)first)*100.0);
        if(b%10==0)
        b/=10;
    }
}

class example05_04{
    public static void main(String args[])
    {
        e05_04 test1=new e05_04('A',25);
        e05_04 test2=new e05_04(66.23);
        System.out.println("With 2 argument:"+"\n"+"test1.a="+test1.a+"\n"+"test1.b="+test1.b);
        System.out.println("With 1 argument"+"\n"+"test2.a="+test2.a+"\n"+"test2.b="+test2.b);
    }
}