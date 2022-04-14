public class example07_04_SubSubClass extends example07_04_SubClass
{
    public int i;
    public example07_04_SubSubClass(char _letter,String _text,int _i)
    {
        super(_letter,_text);
        int i=_i;
    }
    public example07_04_SubSubClass(example07_04_SubSubClass _copy)
    {
        super(_copy);
        i=_copy.i;
    }
    public void get(){
        super.get();
        System.out.println("int value: "+i);
    }
}