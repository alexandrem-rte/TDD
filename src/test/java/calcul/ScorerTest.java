package calcul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Alexandre Montigny {@literal <alexandre.montigny at rte-france.com>}
 */
public class ScorerTest {

    @Test
    public void initialScoreIsZero() {
        Scorer scorer = new Scorer();
        assertEquals(0, scorer.getScore());
    }

    @Test
    public void scoreAfterOneRoll() {
        Scorer scorer = new Scorer();
        scorer.roll(5);
        assertEquals(5, scorer.getScore());
    }
}
