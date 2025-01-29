package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String chaine) {
		System.out.println("Le " + donnerAuteur()+ nom + " : \"" + chaine + "\".");
	}
	
	protected abstract String donnerAuteur(); 
	
		
	public void frapper(Personnage adversaire) {
		if(!adversaire.estATerre() && !this.estATerre()) {
			this.parler("envoie un grand coup dans la mâchoire de " + adversaire.getNom() + " avec une force de " + force);
			adversaire.recevoirCoup(force / 3);
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		if (forceCoup >= this.force) {
			forceCoup = 0;
			this.parler("J'abandonne !");
		} else {
			this.force -= forceCoup;
			this.parler("Aïe");
		}
	}
	
	public boolean estATerre() {
	    return this.force <= 0; 
	}


	
	
	
	
}
