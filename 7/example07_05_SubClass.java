public class example07_05_SubClass extends example07_05_SuperClass
{
    private int i;
    public example07_05_SubClass(String _text,int _i)
    {
        super(_text);
        i=_i;
    }
    public void get()
    {
        System.out.println("SubClass.class" +" String value: " +this.getText() +"\n"
        + "int value: "+i);
    }
}