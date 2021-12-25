import java.util.Random;
public class example04_05{
    public static void main(String args[]){
        int test [][]=new int [3][5];
        Random random=new Random();
        for(int j=0;j<3;j++)
        for(int k=0;k<5;k++)
        test[j][k]=random.nextInt(10);
        for(int j=0;j<3;j++)
        {
        for(int k=0;k<5;k++){
            System.out.print(test[j][k]+" ");
        }   
    System.out.println(" ");
    }
    System.out.println("Reverse");
    for(int j=0;j<5;j++)
    {
    for(int k=0;k<3;k++)
    System.out.print(test[k][j]+ " ");
    System.out.println(" ");
    }
}
}
