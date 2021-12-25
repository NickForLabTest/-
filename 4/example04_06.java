import java.util.Random;
public class example04_06{
    public static void main(String args[]){
        Random random=new Random();
        int test [][]=new int [5][4];
        for(int j=0;j<5;j++)
        for(int k=0;k<4;k++)
        test[j][k]=random.nextInt(10);

        for(int j=0;j<5;j++)
        {
        for(int k=0;k<4;k++){
        System.out.print(test[j][k]+" ");
        }
        System.out.println(" ");
    }
    int Row_Minus=random.nextInt(5);
    int Column_Minus=random.nextInt(4);
    System.out.println("Delete this row:" +Row_Minus);
    System.out.println("Delete this column:" +Column_Minus);
    int test1 [][]=new int [4][3];
        for(int i=0,r=0;i<4;i++)
        {
            if(r!=Row_Minus){
            for(int k=0,c=0;k<3;k++)
            {
                if(c!=Column_Minus)
                {
                    test1[i][k]=test[r][c];
                    c++;
                }
                else 
                {
                    test1[i][k]=test[r][c+1];
                    c+=2;
                }
            }
            r++;
        }
        else{
            r++;
            for(int k=0,c=0;k<3;k++)
            {
                if(c!=Column_Minus)
                {
                    test1[i][k]=test[r][c];
                    c++;
                }
                else 
                {
                    test1[i][k]=test[r][c+1];
                    c+=2;
                }
            }
            r++;
        }
        }
        for(int x[]:test1)
        {
            for(int y:x){
            System.out.print(y+" ");
            }
        System.out.println(" ");
        }
    }
}


    
    

