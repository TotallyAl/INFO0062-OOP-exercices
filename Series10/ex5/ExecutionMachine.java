package Series10.ex5;

public class ExecutionMachine implements Runnable {

    Action a;
    int n;

    public void execute(Action a, int n) {
        this.a = a;
        this.n = n;

        if (n <= 0)
            return;

        synchronized (a) {
            new Thread(this, "ExecutionMachine").start();
        }

    }

    public void run() {
        for (int i = 0; i < n; i++) {
            a.operation();
        }
    }

}
