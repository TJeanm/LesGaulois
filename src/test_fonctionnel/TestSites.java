package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercing�torix", 5);
		vercingetorix.parler("Je suis un grans guerrier et je vais creer mon village");
		Romain minus=new Romain("Minus",2);
		minus.parler("Je suis en charge de cr�er un nouveau camp romain");
	}
}
