package ControlStructures;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        int number = scanner.nextInt();
        if (number == 12 || number == 1 || number == 2) {
            System.out.println("Winter");
        } else if (number == 3 || number == 4 || number == 5) {
            System.out.println("Spring");
        } else if (number == 6 || number == 7 || number == 8) {
            System.out.println("Summer");
        } else if (number == 9 || number == 10 || number == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("You entered a number outside the range 0-12");
        }
        System.out.println("Finish");
    }
}
