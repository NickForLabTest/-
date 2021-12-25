public class example03_07{
    public static void main(String args[]){
        int size=10;
        char letters[]=new char[size];
        for(int i=0;i<10;i++)letters[i]=(char)(97+2*i);
        for(var h:letters)System.out.print(h+" ");
        System.out.println(" ");
        for(int i=0;i<10;i++) System.out.print(letters[10-1-i]+" ");
    }
}