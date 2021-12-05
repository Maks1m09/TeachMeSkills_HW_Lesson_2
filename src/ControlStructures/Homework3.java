package ControlStructures;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " - the entered number is even");
        } else {
            System.out.println(number + " - the entered number is odd");
        }
        System.out.println("Finish");
    }
}