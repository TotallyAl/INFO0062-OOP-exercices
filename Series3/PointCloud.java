import java.util.Vector;

public class PointCloud {
    private Vector<Coordinates> pointCloud = new Vector<Coordinates>();

    public void addPoint(int x, int y) {
        Coordinates coordinates = new Coordinates(x, y);
        pointCloud.add(coordinates);
    }

    public void translate(int dx, int dy) {

        for (int i = 0; i < pointCloud.size(); i++) {

            pointCloud.get(i).translate(dx, dy);

        }

    }

    public LineSegment[] connectCloudPoints() {
        LineSegment[] lineSegment = new LineSegment[pointCloud.size() - 1];

        for (int i = 0; i < pointCloud.size() - 1; i++) {

            lineSegment[i] = new LineSegment(pointCloud.get(i).getX(), pointCloud.get(i).getY(),
                    pointCloud.get(i + 1).getX(), pointCloud.get(i + 1).getY());
        }

        return lineSegment;
    }

}
