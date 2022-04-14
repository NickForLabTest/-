class test_test
{
    private int a=0;
    public void setA(int number) {a=number;}
    public void getA(){System.out.println(a);}
}
class test
{
    public static void main(String args[])
    {
        test_test test1=new test_test();
        test_test b=test1;
        b.setA(25);
        test1.getA();
        b.getA();
    }
}