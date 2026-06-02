package Series8;

public class NumbersTest {

    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 4;
        double d1 = 2.5;
        double d2 = 10.6;
        short s1 = 3;
        short s2 = 2;

        NumbersCollection<Integer> n_int = new NumbersCollection<Integer>();
        NumbersCollection<Double> n_double = new NumbersCollection<Double>();
        NumbersCollection<Short> n_short = new NumbersCollection<Short>();

        n_int.add(i1);
        n_int.add(i2);

        n_double.add(d1);
        n_double.add(d2);

        n_short.add(s1);
        n_short.add(s2);

        System.out.println(n_int.arithmeticMean());
        System.out.println(n_double.geometricMean());
        System.out.println(n_short.harmonicMean());
    }

}
