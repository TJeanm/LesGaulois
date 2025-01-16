package personnages;

public class Gaulois extends Personnage {
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	@Override
	public void parler(String chaine) {
		String nomRomain=getNom();
		System.out.println("Le gaulois " + nomRomain + " : \"" + chaine + "\".");
	}

	@Override
	protected String donnerAuteur() {
		return "Gaulois ";
	}
}
