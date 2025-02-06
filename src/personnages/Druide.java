package personnages;

import java.security.SecureRandom;
import java.util.Random;

import objets.Potion;

public class Druide extends Gaulois {
	private Potion potion;
	private Random random;

	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fabriquerPotion(int quantite) {
		int puissance = 2 + random.nextInt(5);
		potion = new Potion(puissance);
		potion.fabriquerPotion(quantite);
		this.parler("J'ai concocté "+quantite+" potions de puissance "+potion.getDose());
	}


	public void donnerPotion(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) {
			this.parler("Non, Obélix Non !... Et tu le sais très bien !");
			return;
		}
		if (potion.getDose() > 0) {
			potion.dose--;
			gaulois.setPuissancePotion(potion.getPuissance());
			this.parler("donne une potion de puissance " + potion.getPuissance() + " à " + gaulois.getNom() + ".");
		} else {
			this.parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
	}
	
	
}
