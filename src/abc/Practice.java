package abc;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // multiplication table
        for (int i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + 2*i);
        }

        //average & Total of 5 subjects marks
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int total = 0;
        int avg = 0;
        System.out.println("enter the marks");


        for (int i = 0; i<5 ; i++){
            arr[i]= sc.nextInt();

        }
        for (int i = 0; i<5 ; i++){
            System.out.println(arr[i]);
        }

        for (int i = 0;i<5; i++){
            total = total + arr[i];
            avg = total / 5;
        }
        System.out.println("The total marks ="+total);
        System.out.println("The average is ="+avg);

        // Declare an array to hold 10 decimal values and calculates sum of this values

        int sum = 0;
        Scanner SC = new Scanner(System.in);

        int sub[]= new int[10];
        System.out.println("enter the 10 number=");
        for (int i = 0 ; i<sub.length ; i++){
            sub[i]=SC.nextInt();
        }
        for (int i = 0 ; i<sub.length ; i++){
            System.out.println(sub[i]);
        }
        for (int i = 0 ; i<sub.length ; i++){
            sum = sum + sub[i];

        }
        System.out.println("Sum: "+sum);

        // Declare an array of char and store your first name

        char[] name = new char[]{'B','A','X','I','T','A'};
        System.out.println("My first name is:");
        for (int a = 0; a <name.length ; a++){
            System.out.println(name[a]);
        }
    }


}
