package chapter3;
/*
*NESTED IFS
* To qualify for a loan, a person must make at least $30,000
* And have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main( String [] args){

        int requiredsalary = 30000;
        int requireyears = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your years expierence");
        double years = scanner.nextDouble();
        scanner.close();

        if(salary >= requiredsalary){
            if(years >= requireyears){
                System.out.println("Congratlations you qualified for the loan");
            }
            else{
                System.out.println("Sorry you should work at your job at least " + requireyears + " years");
            }
        }
        else{
            System.out.println("Sorry the salary required is at least " + requiredsalary);
        }
    }
}
