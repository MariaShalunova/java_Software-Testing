import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistancePositive_positiveAndNegativeNumbers() {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(-5, -7);

        double expected = 9.43;
        double actual = (Math.round(p1.distance(p2) * 100d) / 100d);

        //Assert.assertEquals(p1.distance(p2), 9.43);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDistancePositive_positiveNumbers() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(10, 7);

        double expected = 10.82;
        double actual = (Math.round(p1.distance(p2) * 100d) / 100d);

        //Assert.assertEquals(p1.distance(p2), 9.43);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDistancePositive_negativeNumbers() {
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(-5, -107);

        double expected = 106.08;
        double actual = (Math.round(p1.distance(p2) * 100d) / 100d);

        //Assert.assertEquals(p1.distance(p2), 9.43);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDistancePositive_DistanceZero() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);

        double expected = 0.0;
        double actual = (Math.round(p1.distance(p2) * 100d) / 100d);

        Assert.assertEquals(actual, expected);
    }
}
