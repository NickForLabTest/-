public class example07_04_SubClass extends example07_04_SuperClass
{
    public String text;
    public example07_04_SubClass(char _letter,String _text)
    {
        super(_letter);
        text=_text;
    }
    public example07_04_SubClass(example07_04_SubClass _copy)
    {
        super(_copy);
        text=_copy.text;
    }
    public void get()
    {
        super.get();
        System.out.println("String value: "+text);
    }
}