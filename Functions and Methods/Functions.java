import java.util.*;

public class Functions {

    public static void printMyName(String name){
        System.out.println("The name is "+name);
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name = ");
        String name = sc.next();

        printMyName(name);

        Functions func_Obj = new Functions();
        int sum = func_Obj.add(5,4);
        System.out.println("The sum is = "+sum);

        double sum2 = func_Obj.add(5.00,4);
        System.out.println("The sum is = "+sum2);

        double product = func_Obj.multiple(5,6);
        System.out.println("The product is = "+product);

        double factorial_num = func_Obj.factorial(5);
        System.out.println("The factorial is = "+factorial_num);




    }

    int add(int a, int b)
    {
        System.out.println("INT TYPE ADD");
        return a+b;
    }

    double add(double a, double b)
    {
        System.out.println("DOUBLE TYPE ADD");
        return a+b;
    }

    double multiple(int a, int b)
    {
        return (double)(a*b);
    }

    //Factorial of a number
    int factorial(int num)
    {
        if(num<0)
            return 1;

        if(num == 1 || num == 0)
            return 1;

        return (num)*factorial(num-1);
    }
}
