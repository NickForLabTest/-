public class example07_05_SubClass1 extends example07_05_SuperClass
{
    private char letter;
    public example07_05_SubClass1(String _text,char _letter)
    {
        super(_text);
        letter=_letter;
    }
    public void get()
    {
        System.out.println("SubClass1.class " +"String value: " +this.getText() +"\n"
        +"char value: "+letter);
    }
    
    
}