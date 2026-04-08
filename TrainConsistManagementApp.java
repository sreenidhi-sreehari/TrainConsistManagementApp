import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("======================================\n");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:\n");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " - " + b.capacity);
        }

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting:\n");
        for (Bogie b : bogieList) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}