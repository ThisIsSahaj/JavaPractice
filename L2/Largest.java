package L2;

// Q4 print largest no. among 5 nos.
import java.util.*;

class Largest {
    public static void main(String[] args) {
        int num1,num2,num3,num4,num5;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 nos.");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();
        num5 = sc.nextInt();
        
        if(num1>num2)
        {
          if(num1>num3)
          {
              if(num1>num4)
              {
                  if(num1>num5)
                  {
                      System.out.println(num1+" is greatest");
                  }
                  else
                  {
                      System.out.println(num5+" is greatest");
                  }
              }
              else if(num4>num5)
              {
                   System.out.println(num4+" is greatest");
               }
               else
               {
                   System.out.println(num5+" is greatest");
               }
          }
          else if(num3>num4)
          {
              if(num3>num5)
              {
                  System.out.println(num3+" is greatest");
              }
              else
              {
                System.out.println(num5+" is greatest");   
              }
          }
          else if(num4>num5)
          {
              System.out.println(num4+" is greatest");
          }
          else 
          {
              System.out.println(num5+" is greatest");
          }
        }
          
          else if(num2>num3)
          {
              if(num2>num4)
              {
                  if(num2>num5)
                  {
                      System.out.println(num2+" is greatest");
                  }
                  else
                  {
                      System.out.println(num5+" is greatest");
                  }
              }      
              else if(num4>num5)
              {
                  System.out.println(num4+" is greatest");
              }
              else
              {
                  System.out.println(num5+" is greatest");
              }
          }
              
           
           else if(num3>num4)
           {
               if(num3>num5)
               {
                   System.out.println(num3+" is greatest");
               }
               else
               {
                   System.out.println(num5+" is greatest");
               }
           }
            else if(num4>num5)
            {
                System.out.println(num4+" is greatest");
            }
            else
            {
                System.out.println(num5+" is greatest");
            }
           
        
    }
}

