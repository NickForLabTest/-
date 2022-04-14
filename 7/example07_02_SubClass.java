public class example07_02_SubClass extends example07_02_SuperClass
{
    public int number;
    example07_02_SubClass(int i,String _text)
    {
        super(_text);
        number=i;
    }
    void set()
    {
        super.set("Empty");
        number=0;
    }
    void set(String _text) {super.set(_text);}
    void set(int i) {number=i;}
    void set (int i, String _text)
    {
        super.set(_text);
        number=i;
    }
    public void get()
    {
        super.get();
        System.out.println(number);
    }

}