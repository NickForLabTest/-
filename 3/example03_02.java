import java.util.Scanner; 
public class example03_02{
    public static void main(String args[]){
        Scanner InCMD=new Scanner (System.in);
        String day=InCMD.nextLine();
        System.out.println("Switch method");
        switch(day){
            case "Monday":System.out.println("It's 1 day of week");
            break;
            case "Tuesday":System.out.println("It's 2 day of week");
            break;
            case "Wednesday":System.out.println("It's 3 day of week");
            break;
            case "Thrusday":System.out.println("It's 4 day of week");
            break;
            case "Friday":System.out.println("It's 5 day of week");
            break;
            case "Saturday":System.out.println("It's 6 day of week");
            break;
            case "Sunday":System.out.println("It's 7 day of week");
            break;
            default: System.out.println("You write wrong day of week! Maybe you write day without uppercase first letter?");
        }
    System.out.println("If-else method");
    if(day.equals("Monday")) System.out.println("It's 1 day of week");
    else if(day.equals("Tuesday"))System.out.println("It's 2 day of week");
    else if(day.equals("Wednesday"))System.out.println("It's 3 day of week");
    else if(day.equals("Thrusday"))System.out.println("It's 4 day of week");
    else if(day.equals("Friday"))System.out.println("It's 5 day of week");
    else if(day.equals("Saturday"))System.out.println("It's 6 day of week");
    else if(day.equals("Sunday"))System.out.println("It's 7 day of week");
    else System.out.println("You write wrong day of week! Maybe you write day without uppercase first letter?");

    
}
}

