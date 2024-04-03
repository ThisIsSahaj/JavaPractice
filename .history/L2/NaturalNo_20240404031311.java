//Q1 natural no. or not
import java.util.*;

class NaturalNo {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        num = sc.nextInt();
        
        if(num>0)
        System.out.println(num + " is a Natural No.");
        else
        System.out.println(num + " is NOT a Natural No.");
        
        
    }
}
