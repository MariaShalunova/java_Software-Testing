public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Point p1 = new Point(0, 1);
        Point p2 = new Point(-5, -7);

        System.out.println("Расстояние между точками с координатами: (" + p1.x + ", " + p1.y + ") и ("
                            + p2.x + ", " + p2.y + ") = " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}
