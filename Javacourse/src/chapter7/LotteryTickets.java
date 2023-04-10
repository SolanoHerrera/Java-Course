package chapter7;

//ARRAYS

import java.util.Random;

public class LotteryTickets {
    private static final int LENGHT = 6;

    public static void main(String [] args){
        int[] ticket = generateNumbers();
        printTicket(ticket);

    }
    public static int[] generateNumbers(){

        int[] ticket = new int[6];
        Random random = new Random();
        for (int i=0; i < LENGHT; i++){
            ticket[i] = random.nextInt(69) + 1;
        }
        return ticket;
    }
    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGHT; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
