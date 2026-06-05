import java.util.Random;

public class ForeignAgent implements Runnable {
    private Voter[] voters;

    public ForeignAgent(Voter[] voters) {
        this.voters = voters;

        new Thread(this, "Foreign Agent").start();
    }

    public void run() {
        Random r = new Random();
        for (Voter v : voters) {

            int FBCheckProb = r.nextInt(100);
            if ((v instanceof Retired && FBCheckProb < 10) ||
                    (v instanceof Worker && FBCheckProb < 25) ||
                    (v instanceof Student && FBCheckProb < 40)) {
                v.chanceOfLeaveUpdate(0.1);
            }
        }
    }

}
