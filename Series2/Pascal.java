import java.util.Vector;

public class Pascal {

    private static Vector<long[]> triangle = new Vector<long[]>();

    public void initTriangle(int n) {
        int size = triangle.size();

        for (int i = size; i < n; i++) {
            long[] array = new long[i + 1];

            array[0] = 1;
            array[i] = 1;

            for (int j = 1; j < i; j++) {
                array[j] = triangle.get(i - 1)[j - 1] + triangle.get(i - 1)[j];
            }

            triangle.add(array);
        }
    }

    public long getBinomCoeff(int n, int k) {
        if (n < 0 || k < 0 || k > n)
            return -1;
        if (k == 0 || n == k)
            return 1;

        initTriangle(n + 1);
        return triangle.get(n)[k];
    }

    public void printTriangle() {
        int size = triangle.size();
        System.out.println("Pascal triangle's size is: " + size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle.get(i)[j] + " ");
            }
            System.out.print("\n");
        }

    }

}
