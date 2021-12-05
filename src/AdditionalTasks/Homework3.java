package AdditionalTasks;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i <= 10; i++) {
            for (int k = 0; k <= 10; k++) {
                System.out.print(i + "*" + k + "=" + i * k + " |");
            }
            System.out.println();
        }
        System.out.println("Finish");
    }
}
