package simple;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*FirstProgram fP = new FirstProgram();
        System.out.print("Enter no. from 1 to 7 ");
        int no = scan.nextInt();*/

        for(int i = 1; i<=5; i++ ){
            System.out.print(i);
        }

        int j = 1;
        while (j<=5) {
            System.out.print(j);
            j++;
        }

        int k = 1;
        do {
            System.out.print(k);
            k++;
        } while (k<=5);
    }

}
