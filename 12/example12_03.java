import java.util.*;
public class example12_03
{
    public static void test1(Set <Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());

    }
    public static void test2(Set <Integer> example)
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
    public static void test3(Set <Integer> example)
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

    public static void main(String args[])
    {
        Set <Integer> test=new HashSet();
        test1(test);
        test3(test);          
    }
}