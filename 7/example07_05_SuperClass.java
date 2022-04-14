class example07_05_SuperClass
{
    private String text;
    public example07_05_SuperClass(String _text) {text=_text;}
    public void get()
    {
        System.out.println("SuperClass.class" + " String value: " +text);
    }
    public String getText(){return text;}
    public example07_05_SuperClass() {text="Empty";}

}