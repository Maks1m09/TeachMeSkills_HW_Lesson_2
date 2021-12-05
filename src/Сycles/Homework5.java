package Сycles;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Start");
        int number = 0;
        int i = 10;
        while (i > 0) {
            i--;
            number -= 5;
            System.out.print(number + ", ");
        }
        System.out.println();
        System.out.println("Finish");
    }
}
