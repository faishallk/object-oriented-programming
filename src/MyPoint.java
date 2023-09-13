public class MyPoint {
    private double x, y;

    MyPoint() {
        this(0, 0);
    }

    // Constructor
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double xCor() { // --> to get x Coordinate
        return x;
    }

    public double yCor() { // --> to get y Coordinate
        return y;
    }

    // a^2 = b^2 + c^2 -> using pytaghoras formula
    // give distance between one point to another point with type MyPoint
    public double distance(double a, double b) {
        return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    }

 
    // give distance between one point to another point which have specific coordinate
    public static double distance(double a, double b, double x, double y) {
        return Math.sqrt(Math.pow(a - x, 2) + Math.pow(b - y, 2));
    }

    // Static Method: to give distance between two objects on MyPoint
    public double distance(MyPoint point2) {
        return Math.sqrt(Math.pow(point2.xCor() - x, 2) + Math.pow(point2.yCor() - y, 2));
    }
}
