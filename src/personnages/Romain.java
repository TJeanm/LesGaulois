package personnages;

public class Romain extends Personnage {

	public Romain(String nom, int force) {
		super(nom, force);
	}

	@Override
	public void parler(String chaine) {
		String nomRomain=getNom();
		System.out.println("Le Romain " + nomRomain + " : \"" + chaine + "\".");
	}
	
	protected String donnerAuteur() {
		return "Romain ";
	}

}
