class e05_05
{
    private int first;
    e05_05(int i){
        first=i;
    }
    e05_05()
    {
        first=0;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public int getFirst() {
        return first;
    }
}

class example05_05
{
    public static void main(String args[])
    {
        e05_05 test1=new e05_05();
        e05_05 test2=new e05_05(25);
        e05_05 test3=new e05_05();
        test3.setFirst(30);
        System.out.println(test1.getFirst());
        System.out.println(test2.getFirst());
        System.out.println(test3.getFirst());
    }
}