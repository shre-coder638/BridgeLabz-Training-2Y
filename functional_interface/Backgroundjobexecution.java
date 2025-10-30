package functional_interface;

@FunctionalInterface
interface BackgroundJob {
    void execute();
}

public class Backgroundjobexecution {
    public static void main(String[] args) {
        System.out.println("Main job started.");

         BackgroundJob job = () -> {
            System.out.println("Background task running...");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Processing step " + i);
            }
            System.out.println("Background task finished.");
        };

        job.execute();

        System.out.println("Main job completed.");
    }

}
