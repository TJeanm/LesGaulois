package personnages;

public class Soldat extends Romain {
	
	public Grade grade;
	
	public Soldat(String nom, int force, Grade grade) {
		super(nom, force);
		this.grade = grade;
	}
}
