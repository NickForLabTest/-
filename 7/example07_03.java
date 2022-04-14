public class example07_03
{
    public static void main(String args[])
    {
        example07_03_SuperClass test = new example07_03_SuperClass(5);
        System.out.println(test.toString());
        System.out.println("-----------------");
        example07_03_SubClass test1 = new example07_03_SubClass(15, 'F');
        System.out.println(test1.toString());
        System.out.println("-----------------");
        example07_03_SubSubClass test2=new example07_03_SubSubClass(20, 'S', "Second");
        System.out.println(test2.toString());
        System.out.println("-----------------");
    }
}