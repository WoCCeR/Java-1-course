public class OneDimensionalArrayOfPoints extends AbstractArrayOfPoints {
    private double[] points;

    public OneDimensionalArrayOfPoints(int capacity) {
        points = new double[capacity * 2];
    }

    @Override
    public void setPoint(int i, double x, double y) {
        points[2 * i] = x;
        points[2 * i + 1] = y;
    }

    @Override
    public double getX(int i) {
        return points[2 * i];
    }

    @Override
    public double getY(int i) {
        return points[2 * i + 1];
    }

    @Override
    public int count() {
        return points.length / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] newPoints = new double[points.length + 2];
        System.arraycopy(points, 0, newPoints, 0, points.length);
        newPoints[points.length] = x;
        newPoints[points.length + 1] = y;
        points = newPoints;
    }

    @Override
    public void removeLast() {
        if (points.length > 1) {
            double[] newPoints = new double[points.length - 2];
            System.arraycopy(points, 0, newPoints, 0, points.length - 2);
            points = newPoints;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count(); i++) {
            if (getX(i) != 0.0 || getY(i) != 0.0) {
                s.append("x = ").append(getX(i)).append("\ty = ").append(getY(i)).append("\n");
            }
        }
        return s.toString();
    }
}
