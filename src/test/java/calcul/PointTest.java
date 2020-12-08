package calcul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexandre Montigny {@literal <alexandre.montigny at rte-france.com>}
 */
public class PointTest {

    private static final double TOLERANCE = 0.01;

    @Test
    public void distance_between_same_point_is_zero() {
        Point a = new Point(2.0, 3.0);
        Point b = new Point(2.0, 3.0);
        assertEquals(0.0, a.distance(b), TOLERANCE);
    }

}