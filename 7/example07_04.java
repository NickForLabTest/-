public class example07_04
{
    public static void main(String args[])
    {
        example07_04_SuperClass test = new example07_04_SuperClass('A');
        example07_04_SubClass test1 = new example07_04_SubClass('A',"Hello");
        example07_04_SubSubClass test2 = new example07_04_SubSubClass('A',"Hello",5);
        example07_04_SuperClass ctest = new example07_04_SuperClass(test);
        example07_04_SubClass ctest1 = new example07_04_SubClass(test1);
        example07_04_SubSubClass ctest2 = new example07_04_SubSubClass(test2);
        test.get();
        System.out.println("---------");
        test1.get();
        System.out.println("---------");
        test2.get();
        System.out.println("---------");
        ctest.get();
        System.out.println("---------");
        ctest1.get();
        System.out.println("---------");
        ctest2.get();
        System.out.println("---------");

    }
}