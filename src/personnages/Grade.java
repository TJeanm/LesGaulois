package personnages;

public enum Grade {
	SOLDAT("soldat"), TESSERARIUS("tesseratius"), OPTIO("optio"), CENTURION("centurion");
	
	private String nom;

	private Grade(String nom) {
		this.nom = nom;
	}
	

	@Override
	public String toString() {
		return nom;
	}
}
