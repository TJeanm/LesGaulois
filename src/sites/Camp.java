package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[]soldats;
	private int nbSoldats;
	
	public Camp(Soldat commandant) {
		this.commandant=commandant;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			System.out.println("Le Romain" + soldat.getNom() + " : "
					+ "\"Je mets mon epee au service de Rome dans le camp dirige par \" " + commandant.getNom());
			nbSoldats++;
		}
		System.out.println("Le Romain" + commandant.getNom() + " : \" Désolé " + soldat.getNom()
				+ " notre camp est complet ! \"");
	}

}

