package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		vercingetorix.parler("Je suis un grans guerrier et je vais creer mon village");
		Romain minus=new Romain("Minus",2);
		minus.parler("Je suis en charge de créer un nouveau camp romain");
	}
}
