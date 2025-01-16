package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois=new Gaulois[50];
	private int nbVillageois;
	
	public Village(Gaulois chef) {
		this.chef=chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois() {
		
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
				villageois[nbVillageois] = gaulois; 
				System.out.println("Le Gaulois " + chef.getNom() + " : \" Bienvenue " + gaulois.getNom() + "! \" ");
		}else {
			System.out.println("Le Gaulois" + chef.getNom() + " : \" Désolé "+ gaulois.getNom() + " mon village est deja bien rempli.\""); 

	}
}
}


