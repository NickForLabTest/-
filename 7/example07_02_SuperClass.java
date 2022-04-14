public class example07_02_SuperClass{
    private String text;
    public example07_02_SuperClass() {text="Empty";}
    public example07_02_SuperClass(String _text) {text=_text;}
    public int length() {return text.length();}
    void set(String _text)
    {
        text=_text;
    }
    public void get() {System.out.println(text);}
}