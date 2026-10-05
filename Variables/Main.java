import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World!\n"); // '\n' is to go to next line.
        System.out.println("Hello World!"); // println also print in new line.
        System.out.println("Hello World!");


        //PRITN PATTERN
        print_pattern();

        //VARIABLES
        System.out.println("=".repeat(50));
        System.out.println("VARIABLES");
        System.out.println("=".repeat(50));

        String name = "Nawal";
        System.out.println("Name = " + name);

        int age = 25;
        System.out.println("Age = " + age);

        double price = 25.50;
        System.out.println("Price = " + price);

        //ARITHMATIC OPERATIONS
        arithmatic_operations();


        //INPUT
        input_function();


    } 
    /*
    Print a PATTERN
    ===============
        *
        **
        ***
        ****
    ===============
    */
    static void print_pattern() {
        System.out.println("=".repeat(50));
        System.out.println("PRINT A PATTERN");
        System.out.println("=".repeat(50));
        for(int i=0; i<5; i++) {
            for(int j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    /*====================
    ARITHMATIC OPERATIONS
    ====================*/
    static void arithmatic_operations()
    {
        System.out.println("=".repeat(50));
        System.out.println("ARITHMATIC OPERATIONS");
        System.out.println("=".repeat(50));

        int a = 10;
        int b = 5;

        int sum = a+b;
        System.out.println("Sum a + b = " + sum);

        int difference = a-b;
        System.out.println("Difference a - b = " + difference);

        int product = a*b;
        System.out.println("Product a * b = " + product);

        int quotient = a/b;
        System.out.println("Quotient a / b = " + quotient);

    }

    /*====================
    INPUT OPERATIONS
    Different input methods:

    Method	        What it reads
    nextLine()	    Reads entire line (including spaces)
    next()	        Reads only one word (stops at space)
    nextInt()	    Reads an integer
    nextDouble()	Reads a decimal number
    ====================*/
    static void input_function()
    {
        System.out.println("=".repeat(50));
        System.out.println("ARITHMATIC OPERATIONS");
        System.out.println("=".repeat(50));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Name = " + name);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Age = " + age);

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.println("Price = " + price);
    }

}
