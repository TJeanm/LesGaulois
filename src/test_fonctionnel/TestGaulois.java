package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Soldat;
import personnages.Grade;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {
		
		
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		vercingetorix.parler("Je suis un grans guerrier et je vais creer mon village");
		Soldat minus=new Soldat("Minus",2,Grade.CENTURION);
		minus.parler("Je suis en charge de créer un nouveau camp romain");
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois asterix = new Gaulois("Asterix",5);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Soldat brutus=new Soldat("Brutus",5,Grade.CENTURION);
		Soldat milexus=new Soldat("Milexus",2,Grade.SOLDAT);
		Soldat tulliusOctopus =new Soldat("Tullius Octopus",2,Grade.TESSERARIUS);
		Soldat ballondebaudrus=new Soldat("Ballondebaudrus",3,Grade.OPTIO);
		Camp petitbonum=new Camp(minus);
		Village village=new Village(vercingetorix);
		petitbonum.ajouterSoldat(brutus);
		petitbonum.ajouterSoldat(milexus);
		petitbonum.ajouterSoldat(tulliusOctopus);
		petitbonum.ajouterSoldat(ballondebaudrus);
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		village.afficherVillageois();
		petitbonum.afficherCamp();
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		Soldat briseradius=new Soldat("Briseradius",4,Grade.SOLDAT);
		Soldat chorus=new Soldat("Chorus",4,Grade.CENTURION);
		village.changerChef(abraracourcix);
		petitbonum.changerCommandant(briseradius);
		petitbonum.changerCommandant(chorus);
		
		Druide panoramix = new Druide("Panoramix",1);
		
		panoramix.fabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);



		minus.parler("UN GAU... UN GAUGAU...");


		while(!(asterix.estATerre() || minus.estATerre())) {
		asterix.frapper(minus);
		minus.frapper(asterix);}
		
	}
}
