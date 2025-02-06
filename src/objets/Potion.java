package objets;

public class Potion {
    private final int puissance;
    public int dose;

    public Potion(int puissance) {
        this.puissance = puissance;
    }

    public int getPuissance() {
        return puissance;
    }
    
    
    public int getDose() {
		return dose;
	}

	public void fabriquerPotion(int quantite) {
		for (int i = 0; i < quantite; i++) {
			dose++;
		}
	}
}
