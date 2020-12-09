package calcul;

public class Vue {

    Ecran ecran;

    public Vue(Ecran ecran) {
        this.ecran = ecran;
    }

    public void afficherScoreJoueur(int numJoueur,  int score) {
        ecran.showMessage(String.format("Le score du joueur %s est %s", numJoueur, score));
    }

    public void afficherInvite(int numJoueur) {
        ecran.showMessage(String.format("Joueur %d a vous", numJoueur));
    }
}
