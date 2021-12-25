import java.util.Scanner; 
public class example04_08{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        String text;
        int code_number;
        System.out.println("Enter transform text");
        char choice;
        text=InCMD.nextLine();
        boolean border_error=false;
        System.out.println("Enter key");
        code_number=InCMD.nextInt();
        int check[]=new int[text.length()];
        for(int i=0;i<text.length();i++)
        {
            border_error=false;
            check[i]=text.charAt(i);
            if(check[i]!=32)
            {

                     if(check[i]>=65 && check[i]<=90 && check[i]+code_number>90)
                     {
                    check[i]=check[i]+code_number-26;
                    border_error=true;
                     }
                     if(check[i]>=97 && check[i]<=122 && check[i]+code_number>122)
                     {
                         check[i]=(check[i]+code_number)-26;
                         border_error=true;
                     }
                     if(!border_error) 
                     {
                        check[i]+=code_number;
                     }
            }
            System.out.print((char)check[i]);
        }
        System.out.println(" ");
        System.out.println("Execute reverse transformation?");
        choice=InCMD.next().charAt(0);
        if(Character.toLowerCase(choice)=='y')
        {
            for(int i=0;i<text.length();i++)
            {
                check[i]=text.charAt(i);
                System.out.print((char)check[i]);
            }
            }
        }
        }
