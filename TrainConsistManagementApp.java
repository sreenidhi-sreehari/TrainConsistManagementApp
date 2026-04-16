public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==========================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("\n\nSearch Result:");
        if (found) {
            System.out.println("Bogie ID " + searchId + " found");
        } else {
            System.out.println("Bogie ID " + searchId + " not found");
        }
    }
}
