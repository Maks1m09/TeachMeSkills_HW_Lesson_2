package Сycles;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Start");
        double b = 2;
        for (double i = 10; i <= 20; i++) {
            double squareNumber = Math.pow(i, b);
            System.out.println("squareNumber: " + i + " = " + squareNumber);
        }
        System.out.println("Finish");
    }
}
