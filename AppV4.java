public class AppV4 {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("        VERSION 4 DEMO           ");
        System.out.println("=================================");

        String buildName = "DefaultBuild";

        if (args.length > 0) {
            buildName = args[0];
        }

        System.out.println("BUILD_NAME Parameter: " + buildName);

        // Jenkins environment variables
        String workspace = System.getenv("WORKSPACE");
        String buildNumber = System.getenv("BUILD_NUMBER");
        String jobName = System.getenv("JOB_NAME");
        String user = System.getenv("USERNAME");

        System.out.println("\n--- Jenkins Environment Details ---");
        System.out.println("Workspace Path: " + workspace);
        System.out.println("Build Number: " + buildNumber);
        System.out.println("Job Name: " + jobName);
        System.out.println("System User: " + user);

        System.out.println("\nApplication executed successfully.");
        System.out.println("=================================");
    }
}