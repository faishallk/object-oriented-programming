public class Main {
    public static void main(String[] args) {
        MyPoint pointA = new MyPoint(); // automatically x = 0, y = 0
        MyPoint pointB = new MyPoint(10, 30.5);
        double a = 0, b = 0, x = 10, y = 30.5; // To declare variable which create distance the coordinate -> coordinate & point -> coordinate

        System.out.println("Point A to Point B Distance is: " + pointA.distance(pointB));
        System.out.println("The distance from coordinate (" + x + ", " + y + ")" + " to (" + a + ", " + b + "): "
                + MyPoint.distance(a, b, x, y));
        System.out.println(
                "Distance from Point A to coordinate (" + x + ", " + y + "): " + pointA.distance(x, y) + "\n\n");
    }
}
