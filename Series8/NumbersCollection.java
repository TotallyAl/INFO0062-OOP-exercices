package Series8;

import java.util.Vector;

public class NumbersCollection<T extends Number> {
    private Vector<T> numberSet;

    public NumbersCollection() {
        this.numberSet = new Vector<T>();
    }

    public double arithmeticMean() {
        double sum = 0;
        for (T nb : this.numberSet) {
            sum += nb.doubleValue();
        }
        return sum / this.numberSet.size();
    }

    public double geometricMean() {
        double mean = 1;
        for (T nb : this.numberSet) {
            mean *= nb.doubleValue();
        }

        return Math.pow(mean, 1.0 / this.numberSet.size());
    }

    public double harmonicMean() {
        double sum = 0;
        for (T nb : this.numberSet) {
            sum += 1.0 / nb.doubleValue();
        }
        return this.numberSet.size() / sum;
    }

    public void add(T nb) {
        this.numberSet.add(nb);
    }

    public String toString() {
        return numberSet.toString();
    }

}
