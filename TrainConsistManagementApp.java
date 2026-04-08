import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=================================\n");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry");

        trainConsist.removeFirst();
        trainConsist.removeLast();

        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}