//package Conditional_Statements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        int age = sc.nextInt();

        if(age>18)
        {
            System.out.println("The person is not an Adult.");
        }
        else
        {
            System.out.print("The person is an Adult.");
        }

        //EXERCISE 1
        num_compare();
    }

    /*
    EXERCISE 1:
    Take 2 numbers as input ans return the numbers are equal if not equal which is greater.
    */
   static void num_compare()
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();

        //CHECK CONDITION
        if(num1==num2)
        {
            System.out.println("Numbers are Equal.");
        }
        else if(num1>num2)
        {
            System.out.println("Numbers are not Equal."+ num1 + " > " + num2);
        }
        else
        {
            System.out.println("Numbers are not Equal."+ num2 + " > " + num1);
        }

   }
}
