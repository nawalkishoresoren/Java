import java.util.*;

public class Strings {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Nawal");
        System.out.println(sb);

        //CHAR AT INDEX.
        System.out.println(sb.charAt(0));

        //SET CHAR AT.
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        sb.append("text");       // Returns StringBuilder (chainable)
        System.out.println(sb);

        sb.reverse();               // Returns StringBuilder (chainable)
        System.out.println(sb);

        System.out.println(sb.charAt(0));      // Print the character at index 0
        System.out.println(sb);

        System.out.println(sb.toString());     // Print as string
        System.out.println(sb);

        System.out.println(sb.length());       // Print the length
        System.out.println(sb);


        sb.setCharAt(0, 'P');   // Returns void (nothing)
        System.out.println(sb);

        sb.delete(0, 2);        // Returns StringBuilder
        System.out.println(sb);

        Strings strObj = new Strings();
        System.out.println(strObj.reverseString1("Nawal"));
        System.out.println(strObj.reverseString2("Nawal"));
        System.out.println(strObj.reverseString3("Nawal"));

    }


    /*
    REVERSE STRING
    */

    String reverseString1(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    String reverseString2(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        int start = 0;
        int end = str.length()-1;

        while(start<end)
        {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            
            start++;
            end--;
        }
        return sb.toString();
    }

    String reverseString3(String str)
    {
        char chars[] = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end)
        {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return new String(chars);
    }
}
