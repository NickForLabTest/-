import java.util.Collection;
import java.util.HashMap;

public class example12_02
{
    public static void test1(HashMap <Integer,Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.put(i, i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }

    public static void test2(HashMap <Integer,Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.remove(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test3(HashMap <Integer,Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.remove(example.size()-1);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test4(HashMap <Integer,Integer> example)
    {
        int check=0;
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            check=example.get(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void main(String args[]) 
    {
        HashMap <Integer,Integer> test=new HashMap<Integer,Integer>();
        test1(test);
        test4(test);
    }
}