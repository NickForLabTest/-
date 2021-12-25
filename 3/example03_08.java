public class example03_08{
    public static void main(String args[]){
        char letters[]=new char[10];
        for(int i=0,number=65;i<10;number++)
        {
            switch((char)number){
                case 'B','C','D','F','G','H','J','L','K','M','N','P','Q','R','S','T','V','W','X','Z':
                letters[i]=(char)number;
                i++;
                break;
            }
        }
        for(var h:letters)System.out.print(h);
    }
}