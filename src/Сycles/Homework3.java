package Сycles;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("You entered a negative number");
        }
        System.out.println("Finish");
    }
}
