package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     *This program calculates the amount owed after 3 months when taking a loan
     * paying it back at a rate of 10% a month
     * 
     * @param params include the loan amount as an integer. I added a prompt to it as well
     * @return the program returns an integer, I included it to include a statement as well
     */
    static int getRemainingAmountIn3Months(int amount) {
        for(int i = 0; i <= 2; i++){
            int tenPercent = amount / 10;
            int newAmount = amount - tenPercent;
            amount = newAmount;
        }
        System.out.print("The remaining balance is: ");
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter loan amount:");
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
