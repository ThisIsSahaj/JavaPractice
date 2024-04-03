
// Q5 arithmetic calculator
import java.util.*;

class ArithmeticCalculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        
        System.out.println("Enter Operator +,-,*,/ ");
       char opr = sc.next().charAt(0);
        
        System.out.println("Enter num2");
        num2 = sc.nextInt();
    
        switch(opr)
        {
            case '+': 
                {
                    System.out.println("Addition is: "+ (num1+num2));
                    break;
                }
            case '-': 
                {
                    System.out.println("Subtraction is: "+(num1-num2));
                    break;
                }    
            case '*': 
                {
                    System.out.println("Multiplication is: "+(num1*num2));
                    break;
                }
            case '/': 
                {
                    System.out.println("Division is: "+(num1/num2));
                    break;
                }
            default:
            {
                    System.out.println("Please enter valid operator");
            }
        }
        
      
    }
}

