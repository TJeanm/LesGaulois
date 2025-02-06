package objets;

public enum Equipements {
	CASQUE("casque"), BOUCLIER("bouclier"), PLASTRON("plastron");
	
	private String nom;

	private Equipements(String nom) {
		this.nom = nom;
	}
	

	@Override
	public String toString() {
		return nom;
	}
}
