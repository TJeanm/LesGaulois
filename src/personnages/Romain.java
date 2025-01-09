package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String chaine) {
		System.out.println("Le Romain " + nom + " : \"" + chaine + "\".");
	}

	public void recevoirCoup(int forceCoup) {
		if (forceCoup >= this.force) {
			this.force = 0;
			this.parler("J'abandonne !");
		} else {
			this.force -= forceCoup;
			this.parler("Aïe");
		}
	}

}
