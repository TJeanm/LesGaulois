package personnages;

import Equipements.Potion;

public class Gaulois extends Personnage {

	private double puissancePotion = 1.0;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	public void boirePotion(Potion potion) {
		if ("Obélix".equals(this.getNom())) {
			this.parler("Non, non, non ! Je n'ai pas le droit de boire de la potion magique !");
			return;
		}
		this.puissancePotion = potion.getPuissance();
		this.parler("boit une potion de puissance " + this.puissancePotion);
	}

	@Override
	public void frapper(Personnage victime) {
		int forceCoup = (int) ((this.force) * this.puissancePotion / 3);
		if (victime.estATerre()) {

		} else if (this.estATerre()) {
			this.parler("Je ne peux plus me battre...");
		} else if (!victime.estATerre() && !this.estATerre()) {

			super.parler(
					"envoie un grand coup dans la mâchoire de " + victime.getNom() + " avec une force de " + forceCoup);
			victime.recevoirCoup(forceCoup);
			this.puissancePotion = Math.max(1.0, this.puissancePotion - 0.5);

		}
	}

	@Override
	public void parler(String chaine) {
		String nomRomain = getNom();
		System.out.println("Le gaulois " + nomRomain + " : \"" + chaine + "\".");
	}

	@Override
	protected String donnerAuteur() {
		return "Gaulois ";
	}

	public void setPuissancePotion(int puissance) {
		puissancePotion = puissance;

	}
}
