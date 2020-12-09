package calcul;

public class Vue {

    private final IEcran ecran;

    public Vue(IEcran ecran) {
        this.ecran = ecran;
    }

    public void afficherScoreJoueur(int numJoueur,  int score) {
        this.ecran.showMessage(String.format("Le score du joueur %s est %s", numJoueur, score));
    }

    public void afficherInvite(int numJoueur) {
        this.ecran.showMessage(String.format("Joueur %d a vous", numJoueur));
    }
}
