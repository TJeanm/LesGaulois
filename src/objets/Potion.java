package objets;

import java.util.Random;

public class Potion {
    private final int puissance;
    private Random random;
    private int dose;

    public Potion(int puissance) {
        this.puissance = puissance;
    }

    public int getPuissance() {
        return puissance;
    }
    
    
    
    public int getDose() {
		return dose;
	}e

	public void fabriquerPotion(int quantite) {
		if (quantite + nombrePotions > stockPotions.length) {
			augmenterTailleStock(quantite + nombrePotions - stockPotions.length);
		}
		int puissance = 2 + random.nextInt(5);
		for (int i = 0; i < quantite; i++) {

			stockPotions[nombrePotions++] = new Potion(puissance);
		}
		this.parler("J'ai concocté " + quantite + " potions de puissance " + puissance);
	}

}
