package entites;

/*import entites2.Personne;*/

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne();
		p1.nom="Jean";
		p1.prenom="Bon";
		p1.add = new AdressePostale();
		Personne p2 = new Personne();
		p2.nom="Adrien";
		p2.prenom="Agreste";
		p2.add = new AdressePostale();
	}

}
