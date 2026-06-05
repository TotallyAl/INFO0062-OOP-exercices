import java.util.Random;

public class Jogging {
    public static void main(String[] args) {
        int numRunners = 100;
        FinishLine fl = new FinishLine();
        Monitor m = new Monitor(fl, numRunners);

        Random rand = new Random();
        for (int i = 1; i <= numRunners; i++) {
            String name = "Runner-" + i;
            double distance = 7.0;

            double speed = 12.0 + rand.nextDouble() * 4.0;

            Runner runner = new Runner(name, distance, speed, fl);
            System.out.println(name + " started! (Speed: " + String.format("%.1f", speed) + "km/h)");
            runner.start();
        }
    }
}
