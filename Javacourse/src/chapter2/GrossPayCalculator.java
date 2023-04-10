package chapter2;
//Java Fundamentals
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String ang[]){
        // Get the number of hours worked
        System.out.println("Enter the numbers the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.print("Enter the employee pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours and pay rate
        double grossPay = hours * rate;


        // Display results
        System.out.print("The employee gross pay is $" + grossPay);
    }
}
