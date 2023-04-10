package chapter5;

import java.util.Scanner;

/*
VARIABLE SCOPE
Write an instant credit check program that aproves anyone who makes
more than $25,000 and has a credit score of 700 or better.
reject all others.
 */
public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        double salary = getsalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(creditScore,salary);
        notifyUser(qualified);


    }
    public static double getsalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
       return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! you have been approved.");
        }
        else {
            System.out.println("Sorry! you have been declined.");
        }
    }


}
