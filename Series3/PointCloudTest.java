public class PointCloudTest {

    public static void main(String[] args) {

        PointCloud pointCloud = new PointCloud();

        pointCloud.addPoint(0, 1);
        pointCloud.addPoint(2, 2);
        pointCloud.addPoint(2, 0);

        LineSegment[] lineSegments = pointCloud.connectCloudPoints();

        for (int i = 0; i < lineSegments.length; i++) {
            System.out.println(lineSegments[i].toString());
        }

    }
}
