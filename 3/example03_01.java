import java.util.Scanner; 
public class example03_01{
    public static void main(String args[]){
        Scanner InCMD=new Scanner(System.in);
        int number=InCMD.nextInt();
        switch(number){
            case 1: System.out.println("It's Monday!");
            break;
            case 2: System.out.println("It's Tuesday!");
            break;
            case 3: System.out.println("It's Wednesday!");
            break;
            case 4: System.out.println("It's Thrusday!");
            break;
            case 5: System.out.println("It's Friday!");
            break;
            case 6: System.out.println("It's Saturday!");
            break;
            case 7: System.out.println("It's Sunday!");
            break;
            default:System.out.println("You write wrong number!");
        } 
    }
}