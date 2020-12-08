package calcul;

import java.util.ArrayList;

/**
 * @author Alexandre Montigny {@literal <alexandre.montigny at rte-france.com>}
 */
public class Scorer {

    private int score = 0;
    private ArrayList<Integer> rolls = new ArrayList<>(2);

    public int getScore() {
        rolls.forEach(integer -> score += integer);
        return score;
    }

    public void roll(int i) {
        rolls.add(i);
    }
}
