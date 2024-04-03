//Q2 Leap year or not
import java.util.*;

class LeapYear{
    public static void main(String[] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        year = sc.nextInt();
        
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("Leap year");
                }
                else
                {
                    System.out.println("NOT a Leap year");
                }
            }
            else
                {
                    System.out.println("Leap year");
                }    
            
        }
        else
                {
                    System.out.println("NOT a Leap year");
                }
    } 
}

