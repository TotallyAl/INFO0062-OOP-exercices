public class BinomCoeff {

    public static void main(String args[]) {
        System.out.println("Hello World");

        Pascal pascal = new Pascal();
        Pascal2 pascal2 = new Pascal2();

        // System.out.println(pascal.getBinomCoeff(0, 0));
        // System.out.println(pascal.getBinomCoeff(1, 0));
        // System.out.println(pascal.getBinomCoeff(10, 3));
        pascal.initTriangle(10);
        pascal.printTriangle();

        pascal2.setSize(10);
        pascal2.initTriangle();
        pascal2.printTriangle();

    }

}
