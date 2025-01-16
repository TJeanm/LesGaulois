package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 6);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("Minus", 9);
		minus.parler("UN GAU... UN GAUGAU...");
		/*
		 * for(int i=0;i<2;i++) { minus.recevoirCoup(3); }
		 */
		for (int i = 0; i < 5; i++) {
			asterix.frapper(minus);
		}
	}

}
