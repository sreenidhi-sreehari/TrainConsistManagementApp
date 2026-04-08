public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=================================\n");

        String[] bogies = new String[10];
        int count = 0;

        bogies[count++] = "Sleeper";
        bogies[count++] = "AC Chair";
        bogies[count++] = "First Class";

        System.out.print("After Adding Bogies:\nPassenger Bogies : [");
        for (int i = 0; i < count; i++) {
            System.out.print(bogies[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");

        int removeIndex = -1;
        for (int i = 0; i < count; i++) {
            if (bogies[i].equals("AC Chair")) {
                removeIndex = i;
                break;
            }
        }

        if (removeIndex != -1) {
            for (int i = removeIndex; i < count - 1; i++) {
                bogies[i] = bogies[i + 1];
            }
            count--;
        }

        System.out.print("\nAfter Removing 'AC Chair':\nPassenger Bogies : [");
        for (int i = 0; i < count; i++) {
            System.out.print(bogies[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (bogies[i].equals("Sleeper")) {
                found = true;
                break;
            }
        }

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + found);

        System.out.print("\nFinal Train Passenger Consist:\n[");
        for (int i = 0; i < count; i++) {
            System.out.print(bogies[i]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}