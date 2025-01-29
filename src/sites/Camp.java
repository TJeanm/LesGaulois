package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[3];
	private int nbSoldats = 0;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void changerCommandant(Soldat newCommandant) {
		if (newCommandant.grade == Grade.CENTURION) {
			this.commandant = newCommandant;
			System.out.println("Le romain " + newCommandant.getNom() + " : \" Moi " + newCommandant.getNom()
					+ " je prends la direction du camp romain.\"");
		} else {
			System.out.println("Le romain " + newCommandant.getNom()
					+ " : \" Je ne suis pas suffisamennt gradé pour prendre la direction du camp romain. \"");
		}
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			System.out.println("Le romain " + soldat.getNom() + " : "
					+ "\"Je mets mon epee au service de Rome dans le camp dirige par " + commandant.getNom() + "\"");
			nbSoldats++;
		} else {
			System.out.println("Le romain " + commandant.getNom() + " : \" Désolé " + soldat.getNom()
					+ " notre camp est complet ! \"");
		}
	}

	public void afficherCamp() {
		System.out.println("\nLe camp dirigé par " + getCommandant().getNom() + " contient les soldats :");
		for (int i = 0; i < soldats.length; i++) {
			System.out.println("- " + soldats[i].getNom());
		}
	}

}
