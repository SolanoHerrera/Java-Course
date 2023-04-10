package chapter3;
/*
IF ELSE
All salespeople are expected to make at least 10 sales each week.
For those who do, they recieve a congratulations message.
For those who dont, they are informed of how many sales they where short-
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String [] args){
        int quota = 10;

        System.out.print(" Enter the number of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if ( sales >= quota){
            System.out.print("Congratulations!");
        }
        else{
            int salesshort = quota - sales;
            System.out.print("You were " + salesshort + " salesshort");
        }
    }
}
