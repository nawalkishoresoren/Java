public class Main {
    public static void main(String[] args)
    {
        // FOR LOOP
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello "+ i);
        }

        // WHILE LOOP
        while_loop();

        Main obj  = new Main();
        obj.while_loop2();

        // DO WHILE LOOP
        do_while_loop();

        //FOR EACH
        print_array();
    }

    /*=====================
        WHILE LOOP
    /*=====================*/
   static void while_loop()
   {
        System.out.println("= ".repeat(50));
        System.out.println("WHILE LOOP  = static void while_loop");
        System.out.println("= ".repeat(50));
        int i = 5;
        while(i>0)
        {
            System.out.println("Hello "+ i);
            i--;
        }
   }

   void while_loop2()
   {
        System.out.println("= ".repeat(50));
        System.out.println("WHILE LOOP  = void while_loop");
        System.out.println("= ".repeat(50));
        int i = 5;
        while(i>0)
        {
            System.out.println("Hello "+ i);
            i--;
        }
   }

   /*=====================
        DO WHILE LOOP
    /*=====================*/
    static void do_while_loop()
   {
        System.out.println("= ".repeat(50));
        System.out.println("Do WHILE LOOP  = static void do_while_loop");
        System.out.println("= ".repeat(50));
        int i = 5;
        do{
            System.out.println("Hello "+ i);
            i--;
        }
        while(i>0);
   }

   /*=====================
        For Each
    /*=====================*/
    static void print_array()
    {
        System.out.println("= ".repeat(50));
        System.out.println("FOR EACH");
        System.out.println("= ".repeat(50));

        int[] numbers = {0,1,2,3,4,5};

        for(int num: numbers)
        {
            System.out.println("Hello "+ num);
        }
    }
}
