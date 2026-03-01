public class AppV1 {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        VERSION 1 DEMO           ");
        System.out.println("=================================");

        boolean runTest = false;

        if (args.length > 0) {
            runTest = Boolean.parseBoolean(args[0]);
        }

        System.out.println("RUN_TEST parameter value: " + runTest);

        if (runTest) {
            System.out.println("Test execution started...");
            System.out.println("Loading test cases...");
            System.out.println("Executing test cases...");
            System.out.println("Validating results...");
            System.out.println("All test cases passed successfully!");
        } else {
            System.out.println("RUN_TEST is false.");
            System.out.println("Skipping test execution...");
        }

        System.out.println("Application execution finished.");
        System.out.println("=================================");
    }
}