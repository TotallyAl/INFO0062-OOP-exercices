public class FinishLine implements TimeReporting {
    private boolean resultAvailable;
    private String result;
    private int nbFinishedRunners;

    public FinishLine() {
        resultAvailable = false;
        nbFinishedRunners = 0;
    }

    public synchronized String getResult() {

        while (!this.resultAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Interrupted while waiting: " + e.getMessage());
            }
        }

        this.resultAvailable = false;
        this.nbFinishedRunners++;
        notifyAll();
        return this.result;
    }

    public synchronized void report(String res) {
        while (this.resultAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Interrupted while waiting: " + e.getMessage());
            }
        }
        resultAvailable = true;
        result = res;
        notifyAll();
    }

    public boolean allFinished(int nbRunners) {
        if (this.nbFinishedRunners != nbRunners) {
            return false;
        } else {
            return true;
        }
    }

}
