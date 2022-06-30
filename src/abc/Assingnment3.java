package abc;

import java.util.Scanner;

public class Assingnment3 {

    public static void main(String[] args) {

        // sum of numbers
        Scanner number = new Scanner(System.in);
        System.out.println("enter number");
        int Y = number.nextInt();
        int total = 0;
        int i = 1;
        while (i <= Y){
            total = i + total;
            System.out.println(total);
            i++;
        }

        // factorial of a number

        Scanner N = new Scanner(System.in);
        System.out.println("any number");
        int X = N.nextInt();
        int factorial = 1;
        int y = 5;
        while (y >= X){
            factorial = y*factorial;
            System.out.println(factorial);
            y--;
        }

        // Guessing game;

        int magicNo = 30;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("make a guess of my magic no...");
            int guessedNo = sc.nextInt();

            if(guessedNo == magicNo){
                System.out.println("congrats..number is correct");
                break;
            } else if (guessedNo > magicNo) {
                System.out.println("sorry..try another no..");
                System.out.println("[Hint: your guessed number is greater than magic number]");
            }
            else {
                System.out.println("sorry..try another no..");
                System.out.println("[Hint : your guessed number is lesser than magic number]");

            }
        }

        // switch case

        Scanner yz = new Scanner(System.in);
        System.out.println("month number");
        int month = yz.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("31 days in this month");
            case 4,6,9,11:
                System.out.println("30 days in this month");
            case 2:
                System.out.println("month has 28 days in non-leap year and 29 days in a leap year");
            default:
                System.out.println("invalid month number");
        }

    }
}



