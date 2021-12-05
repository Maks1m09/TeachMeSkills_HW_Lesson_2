package ControlStructures;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Warmly");
        } else if (temperature <= -5 && temperature > -20) {
            System.out.println("Normally");
        } else if (temperature <= -20) {
            System.out.println(" Coldly");
        }
        System.out.println("Finish");
    }
}
