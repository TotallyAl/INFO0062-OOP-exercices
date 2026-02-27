import java.lang.Math;

public class LineSegment {
    private Coordinates point1, point2;

    public LineSegment(int x1, int y1, int x2, int y2) {

        this.point1 = new Coordinates(x1, y1);
        this.point2 = new Coordinates(x2, y2);

    }

    public void translate(int dx, int dy) {
        point1.translate(dx, dy);
        point2.translate(dx, dy);
    }

    public double lengthSegment() {

        double dx = point2.getX() - point1.getX();
        double dy = point2.getX() - point1.getX();

        double length = Math.hypot(dx, dy);

        return length;
    }

    public String toString() {
        return "[" + point1.toString() + ", " + point2.toString() + "]";
    }

}
