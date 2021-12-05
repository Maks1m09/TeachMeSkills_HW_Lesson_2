package Сycles;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Start");
        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 7 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println("Finish");
    }
}
