import java.util.*;
public class example12_01
{
    public static void test1(LinkedList <Integer> example)
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
    public static void test2(LinkedList <Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.addFirst(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test3(LinkedList <Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.add(example.size()/2,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test4(LinkedList <Integer> example)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.remove(0);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test5(LinkedList <Integer> example)
    {
        
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.removeLast();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test6(LinkedList <Integer> example)
    {
        
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            example.remove(example.size()/2);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(example.size());
    }
    public static void test7(LinkedList <Integer> example)
    {
        int value=0;
        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++)
        {
            value=example.get(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(value);
    }
    public static void main(String args[])
    {
        LinkedList <Integer> check =new LinkedList<Integer>();
        test1(check);
        test7(check);
  
    }
}