import java.util.Scanner; 
public class example03_06{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        int size=InCMD.nextInt();
        if(size<=0){
            System.out.println("You write wrong count of number in array");
            return;
        }
        int array[]=new int[size];
        for(int i=0,number=0;i<size;number++)
        {
            if(number%5==2){
                array[i]=number;
                i++;
            }    
        }
        for(int h:array)System.out.print(h+" ");
    }
}