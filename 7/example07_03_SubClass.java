public class example07_03_SubClass extends example07_03_SuperClass
{
    public char text;
    public example07_03_SubClass(int i,char _text)
    {
        super(i);
        text=_text;
    }
    public void set(int i,char _text)
    {
        super.set(i);
        text=_text;
    }
    public String toString()
    {
        String answer="SubClass.class" + " "
        + "integer value: " + this.number + "\n" + 
        "char value: " + text;
        return answer;
    }
}