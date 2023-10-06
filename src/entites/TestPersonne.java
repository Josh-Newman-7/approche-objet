package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne("Jean","Bon");
		p1.add = new AdressePostale(128,"Jean Macé","44000","FrancPrix");
		Personne p2 = new Personne("Adrien Agreste","Agreste", new AdressePostale(74,"C'est une abération de mettre des attributs en public","Paris","2A"));
	}

}
