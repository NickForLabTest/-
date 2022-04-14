public class example07_03_SuperClass
{
    public int number;
    public void set(int i) {number=i;}
    public example07_03_SuperClass(int i) {number=i;}
    public String toString()
    {
        String answer="SuperClass.class"+" "
        + "integer value: " + number;
        return answer;
    }
}