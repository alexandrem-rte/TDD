package calcul;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class VueTest {
    @Test
    public void afficher_score_joueur(){
        Ecran ecranMock = Mockito.mock(Ecran.class);
        Vue vue = new Vue(ecranMock);
        vue.afficherScoreJoueur(0, 66);

        Mockito.verify(ecranMock).showMessage("Le score du joueur 0 est 66");
    }

    @Test
    public void afficher_invite_joueur(){
        Ecran ecranMock = Mockito.mock(Ecran.class);
        Vue vue = new Vue(ecranMock);
        vue.afficherInvite(3);

        Mockito.verify(ecranMock).showMessage(anyString());
        Mockito.verify(ecranMock).showMessage("Joueur 3 a vous");
    }
}