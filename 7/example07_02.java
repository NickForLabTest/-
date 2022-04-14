public class example07_02{
    public static void main(String args[])
    {
        example07_02_SuperClass test = new example07_02_SuperClass ("check");
        example07_02_SuperClass test1 = new example07_02_SuperClass ();
        System.out.println("SuperClass with one argument:");
        test.get();
        System.out.println("---------------");
        System.out.println("SuperClass with zero argument:");
        test1.get();
        System.out.println("---------------");
        System.out.println("SubClass with two argument:");
        example07_02_SubClass test3=new example07_02_SubClass(5,"Hello");
        test3.get();
        System.out.println("---------------");
        System.out.println("SubClass assigment without argument");
        test3.set();
        test3.get();
        System.out.println("---------------");
        System.out.println("SubClass assigment with one String argument");
        test3.set("Reassignment");
        test3.get();
        System.out.println("---------------");
        System.out.println("SubClass assigment with one int argument");
        test3.set(5);
        test3.get();
        System.out.println("---------------");
        System.out.println("SubClass assigment with two argument");
        test3.set(25,"End of example");
        test3.get();
    }
}