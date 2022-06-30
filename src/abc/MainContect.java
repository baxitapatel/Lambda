package abc;


import java.util.Arrays;
import java.util.Scanner;

public class MainContect {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1: {
                    if (checkArray(contacts)){
                        System.out.println("ADDRESS BOOK IS FULL ");

                    }
                    System.out.println("Enter Contact detail separated by space ");
                    String[] Details = scanner.nextLine().split(" ");
                   if (Details != null ){
                       Contact contact =new Contact(Details[0],Details[1],Details[2],Details[4] );
                        for (int i = 0; i< contacts.length;i++){
                            if (contacts[i]==null){
                                contacts[i] = contact;
                                break;
                            }

                        }
                   }

                }
                break;
                case 2 :{

                }break;
                case 3 :{

                }break;
                case 4 :{
                    System.out.println(Arrays.toString(contacts));

                }break;
                case 0 :{
                    break;
                }
                default:{
                    System.out.println("Invalid input");
                }



            }


        }
    }

    private static boolean checkArray(Contact[] contacts) {
        for (Contact contact: contacts){
            if (contact == null){
                return false;

            }

        }
        return true;
    }

    private static void printMenu() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|1 - Enter new contact                              |");
        System.out.println("|2 - Retrive by Phone                               |");
        System.out.println("|3 - Update by Phone                                |");
        System.out.println("|4 - Print All                                      |");
        System.out.println("|0 - Exit                                           |");
        System.out.println("|---------------------------------------------------|");





    }
}