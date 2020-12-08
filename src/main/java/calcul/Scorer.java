package calcul;

/**
 * @author Alexandre Montigny {@literal <alexandre.montigny at rte-france.com>}
 */
public class Scorer {

    private int score = 0;

    public int getScore() {
        return score ;
    }

    public void roll(int i) {
        score += i;
    }
}
