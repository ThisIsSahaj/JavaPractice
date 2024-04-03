
// Q3 Grades of a student
import java.util.*;

class Grades {
    public static void main(String[] args) {
        int percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage");
        percentage = sc.nextInt();
        
        if(percentage>90)
        System.out.println("Grade A");
        else if(percentage<=90 && percentage>80)
        System.out.println("Grade B");
        else if(percentage<=80 && percentage>70)
        System.out.println("Grade C");
        else if(percentage<=70 && percentage>60)
        System.out.println("Grade D");
        else if(percentage<=60 && percentage>0)
        System.out.println("Grade E");
        else 
        {
        System.out.println("Please enter percentage between 0 to 100 only");
        }
        
        
    }
}

