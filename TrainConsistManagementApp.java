public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Prevent Search on Empty Train ");
        System.out.println("==========================================\n");

        String[] bogieIds = {};

        String searchId = "BG309";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
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
