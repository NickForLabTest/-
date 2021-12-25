import java.util.Scanner;

class e05_01{
    private char letter;
    public void setletter(char i)
    {
        letter=i;
    }
    public int get_number()
    {
        return (int) letter;
    }
    public void see_all()
    {
        System.out.println(letter+" "+(int)letter);
    }
}
public class example05_01{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        char i=InCMD.next().charAt(0);
        e05_01 letter = new e05_01();
        letter.setletter(i);
        System.out.println(letter.get_number());
        letter.see_all();
    }
}

