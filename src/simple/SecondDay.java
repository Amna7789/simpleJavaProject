package simple;

import java.util.Scanner;

public class SecondDay {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int no=0; no<=9; ) {
            System.out.println("Enter no less than 9 if you want to repeat. ");
            no = scan.nextInt();
            System.out.println("square is: " + (no * no));
        }

        int i = 0;
        while (i<=9) {
            System.out.println("Enter no less than 9 if you want to repeat. ");
            i = scan.nextInt();
            System.out.println("square is: " + (i*i));
        }
    }

}
