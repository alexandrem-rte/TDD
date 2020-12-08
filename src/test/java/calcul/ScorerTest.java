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
    @Test
    public void scoreAfterTwoRoll() {
        Scorer scorer = new Scorer();
        scorer.roll(5);
        scorer.roll(5);
        assertEquals(10, scorer.getScore());
    }

    /*@Test (expected = UnvalidValueException)
    public void scoreReturnErrorWhenUnvalidValue(){
        Scorer scorer = new Scorer();
        scorer.roll(-1);
        assertEquals() Equals(, scorer.getScore());
    }*/
}
