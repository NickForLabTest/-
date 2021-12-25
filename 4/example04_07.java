public class example04_07{
    public static void main(String args[]){
        int row=4, column=3,number=0;
        int array[][]=new int [row][column];
        for(int k=0;k<row;k++)
        {
        for(int j=0;j<column;j++){
        array[k][j]=number++;
        }
        if(column>0)
        {
        column--;
        for(int z=1+k;z<row;z++)
        {
           array[z][column]=number++;
        }
    }
    }
    row=4;
    column=3;
    for(int k=0;k<row;k++)
    {
    for(int j=0;j<column;j++){
         System.out.print(array[k][j]+" ");
    }
    System.out.println(" ");
}
}
}