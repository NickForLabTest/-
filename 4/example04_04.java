public class example04_04{
    public static void main(String args[]){
        char test [][]=new char [5][];
        test[0]=new char[1];
        test[1]=new char[2];
        test[2]=new char[3];
        test[3]=new char[4];
        test[4]=new char[5];
        for(int j=0;j<5;j++)
        {
            for(int k=0;k<j+1;k++)
            {
            System.out.print('+');
            }
            System.out.println(" ");
        }
    }
}