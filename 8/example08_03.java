import java.util.Scanner;
import java.util.ArrayList;
public class example08_03{
    static void Input(ArrayList<Integer> example)
    {
        char quest;
        Scanner InCMD=new Scanner(System.in);
        int number;
        number=InCMD.nextInt();
        example.add(number);
        System.out.println("Continue?");
        System.out.println("Y/N");
        quest= InCMD.next().charAt(0);
        quest=Character.toUpperCase(quest);
        if(quest=='N') return;
        Input(example);
    }
    static void Output(ArrayList<Integer> example,int i)
    {
        if(example.size()==0) return;
        if(i<example.size())
        {
        System.out.print(example.get(i)+ " ");
        Output(example, ++i);
        }
        return;
    }
    public  static void main(String args[])
    {
        ArrayList <Integer> first = new ArrayList<Integer>();
        Input(first);
        // for(var h:first)
        // System.out.print(h + " ");
        Output(first,0);

        
    }
}