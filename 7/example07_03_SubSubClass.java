public class example07_03_SubSubClass extends example07_03_SubClass
{
    public String text;
    public void set(int i, char _text, String _text1)
    {
        super.set(i,_text);
        text=_text1;
    }
    public example07_03_SubSubClass (int i,char _text, String _text1)
    {
        super(i,_text);
        text=_text1;
    }
    public String toString()
    {
        String answer="SubSubClass.class" + " " +
        "integer value: " + this.number +"\n"
        +"char value: " + super.text +"\n"
        + "String value: " + text;
        return answer;
    }
    

}