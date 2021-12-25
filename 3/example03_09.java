import java.util.Random;

public class example03_09{
    public static void main(String args[]){
        int numbers[]=new int [10];
        Random random=new Random();
        for(int i=0;i<10;i++)numbers[i]=random.nextInt(100);
        System.out.println("Array:");
        for(int h:numbers)System.out.print(h+" ");
        int min=numbers[0];
        for(int i=0;i<10;i++){
            if(min>numbers[i]) min=numbers[i];

        }
        System.out.println(" ");
        System.out.println("Min number:"+min);
        System.out.print("Index of min number:");
        for(int i=0;i<10;i++)
        {
            if(numbers[i]==min)System.out.print(i+" ");
        }

        
        


    } 
}