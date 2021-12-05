package AdditionalTasks;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Start");
        double interestRate = 0.07;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of the deposit");
        float amountOfDeposit = scanner.nextInt();
        System.out.println("Number of months");
        int NumberOfMonths = scanner.nextInt();
        for (int i = 1; i <= NumberOfMonths; i++) {
            amountOfDeposit += amountOfDeposit * interestRate;
            System.out.println("Number of months:" + i + ". Amount at the end of the month - " + amountOfDeposit);
        }
        System.out.println("final amount: " + amountOfDeposit);
        System.out.println("Finish");
    }
}
