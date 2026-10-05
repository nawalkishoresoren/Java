import java.util.*;

public class Strings {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = sc.nextLine();
        System.out.println("Name is "+name);

        //STRING DECELARATIONS
        String full_name = "Nawal Kishore Soren";
        String sentence = "My name is Nawal Soren.";

        //STRING CONCATINATION
        System.out.println("Concatinaton str:Nawal and str:Soren with delimiter '@' " + concatination());
        concatination();

        //LENGTH OD STRING
        System.out.println("The length id str:NAWAL is = " + lengthString("Nawal"));

        //STRING CHARACTER AT
        printCharacters("Nawal");

        //STRNG COMPARE
        boolean result = str_cmp("Nawal","Nawal");
        System.out.println("Bool Result = " + result);

        String sub_string1 = subString("Nawal", 0, 3);
        String sub_string2 = subString("Nawal", 3);
        System.out.println("SubString Result = " + sub_string1);
        System.out.println("SubString Result = " + sub_string2);


    }

    /*=====================
    STRING CONCATINATION
    /*=====================*/
    static String concatination()
    {
        String first_name = "Nawal";
        String last_name = "Soren";

        String full_name = first_name + "@" + last_name;
        return full_name;
    }

    /*=====================
    STRING LENGTH
    /*=====================*/

    static int lengthString(String str)
    {
        return str.length();
    }

    /*=====================
    STRING CHARACTER AT
    /*=====================*/

    static void printCharacters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }

    /*=====================
    STRING COMAPRE
    /*=====================*/
    static boolean str_cmp(String str1, String str2)
    {   
        if(str1.compareTo(str2) == 0)
        {
            System.out.println("The strings are equal.");
            return true;
        }
        System.out.println("The strings are not equal.");
        return false;
    }

    /*=====================
    STRING SUBSTRING
    /*=====================*/
    static String subString(String str, int start, int end)
    {
        if(start<0 || end<start || start>str.length() || end>=str.length())
        {
            return "INVALID START OR END";
        }
        String result = str.substring(start,end+1);
        return result;
    }

    static String subString(String str, int start)
    {
        if(start<0 || start>str.length())
        {
            return "INVALID START";
        }
        String result = str.substring(start);
        return result;
    }
}
