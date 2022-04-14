class example07_04_SuperClass
{
    public char letter;
    public example07_04_SuperClass(char _letter) {letter=_letter;}
    public example07_04_SuperClass(example07_04_SuperClass _copy)
    {
        letter=_copy.letter;
    }
    public void get()
    {
        System.out.println("char value: "+letter);
    }
}