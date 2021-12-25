import java.util.Scanner; 
public class example03_04{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        int counter=0;
        int First=InCMD.nextInt();
        int Second=InCMD.nextInt();
        System.out.println("For method");
        if(First>Second){
            for(int i=0;i<=First-Second;i++)
            System.out.print(Second+i +" ");
        }
        else for(int i=0;i<=Second-First;i++)
                System.out.print(First+i +" ");
        System.out.println(" ");
        System.out.println("While method"); 
        if(First>Second){
            while(counter<=First-Second)
            {
                System.out.print(Second+counter +" ");
                counter++;
            }
        }else while(counter<=Second-First){
            System.out.print(First+counter +" ");
            counter++;
        }
        counter=0;
        System.out.println(" ");
        System.out.println("Do-while method");
        if(First>Second){
            do{
                System.out.print(Second+counter +" ");
                counter++;
            }while(counter<=First-Second);
        }else do{
            System.out.print(First+counter +" ");
            counter++;
        }while(counter<=Second-First);

    }
}