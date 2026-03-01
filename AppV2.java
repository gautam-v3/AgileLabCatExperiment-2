public class AppV2 {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        VERSION 2 DEMO           ");
        System.out.println("=================================");

        String environment = "DEV";

        if (args.length > 0) {
            environment = args[0];
        }

        System.out.println("Selected Environment: " + environment);

        if (environment.equalsIgnoreCase("DEV")) {
            System.out.println("Connecting to Development Server...");
            System.out.println("Loading Dev Database...");
            System.out.println("Dev Environment Ready.");
        } 
        else if (environment.equalsIgnoreCase("TEST")) {
            System.out.println("Connecting to Testing Server...");
            System.out.println("Loading Test Database...");
            System.out.println("Test Environment Ready.");
        } 
        else if (environment.equalsIgnoreCase("PROD")) {
            System.out.println("Connecting to Production Server...");
            System.out.println("Loading Production Database...");
            System.out.println("Production Environment Ready.");
        } 
        else {
            System.out.println("Invalid Environment Selected!");
        }

        System.out.println("Execution Completed.");
        System.out.println("=================================");
    }
}
