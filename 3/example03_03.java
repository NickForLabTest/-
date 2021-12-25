import java.util.Scanner; 
public class example03_03{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        int size=InCMD.nextInt();
        int mas_for[]=new int [size];
        mas_for[0]=1;
        mas_for[1]=1;
        for(int i =0;i<size-2;i++){
            mas_for[i+2]=mas_for[i]+mas_for[i+1];
        }
        System.out.println("For method");
        for(int h:mas_for) System.out.print(h+" ");
        System.out.println();
        System.out.println("While method");
        int mas_while[]=new int [size];
        mas_while[0]=1;
        mas_while[1]=1;
        int counter=0;
        while(counter<size-2)
        {
            mas_while[counter+2]=mas_while[counter]+mas_while[counter+1];
            counter++;
        }
        for(int h:mas_while)System.out.print(h+" ");
        System.out.println();
        System.out.println("Do-while method");
        int mas_do_while[]=new int[size];
        mas_do_while[0]=1;
        mas_do_while[1]=1;
        counter=0;
        do{
            mas_do_while[counter+2]=mas_do_while[counter]+mas_do_while[counter+1];
            counter++;
        }while(counter<size-2);
        for(int h:mas_do_while)System.out.print(h+" ");
    }

}