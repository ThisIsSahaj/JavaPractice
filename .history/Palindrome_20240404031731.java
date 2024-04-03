// Q7 Palindrome
import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        int num, temp;
        int sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        num = sc.nextInt();
        
        temp = num;
        
        while(temp!= 0)
        {
            sum = (sum*10)+(temp%10);
            temp = temp/10;
        }
        if(sum == num)
        {
            System.out.println("The no. is a PALINDROME");
        }
        else{
            
            System.out.println("The no. is NOT a PALINDROME");
        }
      
    }
}
