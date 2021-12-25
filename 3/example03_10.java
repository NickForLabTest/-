import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class example03_10{
    public static void main(String args[]){
        Random random=new Random();
        int numbers[]=new int[10];
        for(int i=0;i<10;i++) numbers[i]=random.nextInt(100);
        Arrays.sort(numbers);
        System.out.println("Sort array in ascending order");
        for(int h:numbers)System.out.print(h+" ");
        System.out.println(" ");
        for(int i=0;i<5;i++)
        {
            numbers[i]^=numbers[10-1-i];
            numbers[10-1-i]^=numbers[i];
            numbers[i]^=numbers[10-1-i];
        }
        System.out.println("Sort array in descending order");
        for(int h:numbers)System.out.print(h+" ");
        
    }
}