package abc;

import java.util.Scanner;

public class Assingment4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse:");
        String S1 = sc.next();
        char[] chars = S1.toCharArray();
        char [] ch = new char[chars.length];
        int LI = chars.length - 1;

        // Reverse a String:

        for (int i = 0 ; i <= LI ; i++){
            ch[LI - i] = chars[i];

        }
        String reverseString = new String(ch);
        System.out.println("Revers String is " +reverseString);

        // check string is palindrome or not

        if (S1.equals(reverseString)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }

        //Convert to Uppercase:

        S1 = S1.toUpperCase();
        System.out.println("Uppercase : " +S1);






    }
}

