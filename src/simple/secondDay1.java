package simple;

import java.util.Scanner;

public class secondDay1 {
    public static void main(String[] args) {
        /*
         * Menu Menu
         * 1. calculate square
         * 2. calculate cube
         * 3. calculate percentage
         * 0. to repeat menu / go to main menu
         * Choose your option (Press 1)
         * Enter a no. 5
         * Square is : 25
         * Enter 0 to goto main menu
         * */


        Scanner s = new Scanner(System.in);
        System.out.println("Choose an option: ");
        int user = s.nextInt();
        /*System.out.println("Enter a number: ");
        int num = s.nextInt();*/



            if (user == 1) {
                System.out.println("Enter a number: ");
                int num = s.nextInt();
                int square = num * num;
                System.out.println("Square of given number is: " + square);

            } else if (user == 2) {
                System.out.println("Enter a number: ");
                int num = s.nextInt();
                int cube = num * num * num;
                System.out.println("Cube of given number is: " + cube);

            }
            else if(user == 3) {
                System.out.println("Enter marks for course1: ");
                int c1 = s.nextInt();
                System.out.println("Enter marks for course2: ");
                int c2 = s.nextInt();
                System.out.println("Enter marks for course3: ");
                int c3 = s.nextInt();
                int c4 = c1 + c2 + c3;
                double percentage = c4 * 100/300 ;
                System.out.println("Percentage of given number is: " + percentage);
            }
            else if(user == 0){
                System.out.println("Go to main menu");
                for(int i = 0; i <1 ; i++ ){
                    System.out.println("Choose an option: ");
                    user = s.nextInt();
                    System.out.println("Enter a number: ");
                    int num = s.nextInt();

                    if (user == 1) {
                        int square = num * num;
                        System.out.println("Square of given number is: " + square);

                    } else if (user == 2) {
                        int cube = num * num * num;
                        System.out.println("Cube of given number is: " + cube);

                    }
                    else if(user == 3) {
                        System.out.println("Enter marks for course1: ");
                        int c1 = s.nextInt();
                        System.out.println("Enter marks for course2: ");
                        int c2 = s.nextInt();
                        System.out.println("Enter marks for course3: ");
                        int c3 = s.nextInt();
                        int c4 = c1 + c2 + c3;
                        double percentage = c4 * 100/300 ;
                        System.out.println("Percentage of given number is: " + percentage);
                    }

                }
            }

        }}
//}








