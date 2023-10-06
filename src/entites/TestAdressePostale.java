package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale add1 = new AdressePostale();
		add1.codePostal = "44000";
		add1.libelleRue = "Jean macé";
		add1.numRue = 128;
		add1.ville="FrancPrix";
		AdressePostale add2 = new AdressePostale();
		add1.codePostal = "2A";
		add1.libelleRue = "C'est une abération de mettre des attributs en public";
		add1.numRue = 74;
		add1.ville="Paris";

	}

}
