package AdditionalTasks;

import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(1);
        for (int i = 3; i <= 10; i++) {
            arrayList.add(arrayList.get(i - 1) + arrayList.get(i - 2));
        }
        System.out.println(arrayList);
        System.out.println("Finish");
    }
}