package calcul;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexandre Montigny {@literal <alexandre.montigny at rte-france.com>}
 */
public class ScorerTest {

    Scorer scorer;

    @Before
    public void setUp() throws Exception {
        scorer = new Scorer();
    }

    @Test
    public void initialScoreIsZero() {
        assertEquals(0, scorer.getScore());
    }

    @Test
    public void scoreAfterOneRoll() {
        scorer.roll(5);
        assertEquals(5, scorer.getScore());
    }
    @Test
    public void scoreAfterTwoRoll() {
        scorer.roll(5);
        scorer.roll(5);
        assertEquals(10, scorer.getScore());
    }

    // @Test
    public void afterSpareAndTwoScoreIs14() {
        scorer.roll(4);
        scorer.roll(6);
        scorer.roll(2);
        assertEquals(14, scorer.getScore());
    }
}
