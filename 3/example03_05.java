import java.util.Scanner; 
public class example03_05{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        int number=InCMD.nextInt();
        int sum=0;
        System.out.println("For method ");
        for(int i=0, counter=0;counter<number;i++)
        {
            if(i%5==2 || i%3==1){
                sum+=i;
                counter++;
                System.out.print(i + " ");
            }

        }
        System.out.println(" ");
        System.out.println(sum);
        sum=0;
        int counter=0;
        int search_number=0;
        System.out.println("While method ");
        while(counter<number)
        {
            if(search_number%5==2 || search_number%3==1)
            {
                sum+=search_number;
                counter++;
                System.out.print(search_number + " ");
            }
            search_number++;
        }
        System.out.println(" ");
        System.out.println(sum);
        sum=0;
        counter=0;
        search_number=0;
        System.out.println("Do while method ");
        do{
            if(search_number%5==2 || search_number%3==1)
            {
                sum+=search_number;
                counter++;
                System.out.print(search_number + " ");
            }
            search_number++;
        }while(counter<number);
        System.out.println(" ");
        System.out.println(sum);
    }
}