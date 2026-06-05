public class Monitor extends Thread {
    private FinishLine fl;
    private int nbRunners;

    public Monitor(FinishLine fl, int nbRunners) {
        this.fl = fl;
        this.nbRunners = nbRunners;
        new Thread(this, "Monitor").start();
    }

    public void run() {
        while (!this.fl.allFinished(this.nbRunners)) {
            String result = fl.getResult();
            System.out.println("Has finished: " + result);
        }
        System.out.println("All runners have finished!");
    }

}
