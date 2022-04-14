public class example07_05
{
    public static void main(String args[])
    {
        example07_05_SuperClass test=new example07_05_SuperClass("Hello");
        example07_05_SubClass test1=new example07_05_SubClass("World", 5);
        example07_05_SubClass1 test2=new example07_05_SubClass1("check", 'A');
        test.get();
        System.out.println("-------------------");
        test1.get();
        System.out.println("-------------------");
        test2.get();
        System.out.println("-------------------");
        example07_05_SuperClass test3=new example07_05_SuperClass();
        System.out.println("Use superclass referance varibable and assignment to SubClass object");
        test3=test1;
        test3.get();
        System.out.println("-------------------");
    }
}