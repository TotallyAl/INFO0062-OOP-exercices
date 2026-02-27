public class Pascal2 {

    private static int size;
    private static long[][] triangle;

    public void initTriangle() {

        for (int i = 0; i < size; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int new_size) {
        size = new_size;
        triangle = new long[size][size];
    }

    public void printTriangle() {
        System.out.println("Pascal triangle's size is: " + size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.print("\n");

        }

    }
}