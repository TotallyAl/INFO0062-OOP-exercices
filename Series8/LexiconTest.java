package Series8;

public class LexiconTest {
    public static void main(String[] args) {
        String a_label = "Gravity";
        String b_label = "PI";
        String c_label = "Speed of Light";
        String d_label = "Hour in minutes";
        String e_label = "Graavity";

        double a = 9.81;
        double b = 3.14;
        double c = 3000000;
        double d = 60;
        double e = 9.881;

        Lexicon<Double> l = new Lexicon<Double>();
        l.add(a_label, a);
        l.add(b_label, b);
        l.add(c_label, c);
        l.add(d_label, d);
        l.add(e_label, e);

        l.print();
    }
}
