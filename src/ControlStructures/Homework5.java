package ControlStructures;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rainbow number");
        int number = scanner.nextInt();
        switch (number) {
            case (1):
                System.out.println("red");
                break;
            case (2):
                System.out.println("orange");
                break;
            case (3):
                System.out.println("yellow");
                break;
            case (4):
                System.out.println("green");
                break;
            case (5):
                System.out.println("blue");
                break;
            case (6):
                System.out.println("dark blue");
                break;
            case (7):
                System.out.println("purple");
                break;
            default:
                System.out.println("You entered a number outside the range 0-7");
        }
        System.out.println("Finish");
    }
}
