package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[4];
	private int nbVillageois;

	public Village(Gaulois chef) {
		this.chef = chef;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void changerChef(Gaulois newChef) {

		System.out.println("Le gaulois " + getChef().getNom() + " : \" Je laisse mon grand bouclier au grand "
				+ newChef.getNom() + " \"");
		System.out.println("Le gaulois " + newChef.getNom() + " : \"Merci ! \"");
		this.chef = newChef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			System.out.println("Le Gaulois " + chef.getNom() + " : \" Bienvenue " + gaulois.getNom() + "! \" ");
			nbVillageois++;
		} else {
			System.out.println("Le Gaulois" + chef.getNom() + " : \" Désolé " + gaulois.getNom()
					+ " mon village est deja bien rempli.\"");
		}
	}

	public void afficherVillageois() {
		System.out.println("\nLe camp dirigé par " + getChef().getNom() + " est habité par :");
		for (int i = 0; i < villageois.length; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

}
