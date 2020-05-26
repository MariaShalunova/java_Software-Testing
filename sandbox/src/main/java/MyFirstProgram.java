public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Point p1 = new Point(0, 1);
        Point p2 = new Point(-5, -7);

        System.out.printf("Расстояние между точками с координатами: (" + p1.x + ", " + p1.y + ") и ("
                            + p2.x + ", " + p2.y + ") = ");
        System.out.format("%.2f", Point.distance(p1, p2));
    }

}
