import java.util.Scanner;
public class example08_07
{
    public static void main(String args[])
    {
        Scanner InCMD=new Scanner(System.in);
        int i,number;
        Node test1=new Node(0,null);

        System.out.println("Count of numbers?");
        i=InCMD.nextInt();
        while(i>0)
        {
            number=InCMD.nextInt();
            test1.add(number);
            i--;
        }
        System.out.println(test1.output());
        test1.task();
        System.out.println("--------------");
        System.out.println("Find lower and upper value and swap them");
        System.out.println("Original position:");
        System.out.println(test1.output());
        System.out.println("Swap");
        test1.task2();  
        System.out.println(test1.output());

    }
}