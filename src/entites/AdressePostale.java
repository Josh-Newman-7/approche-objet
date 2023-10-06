package entites;

public class AdressePostale {
	private int numRue;
	private String libelleRue;
	private String codePostal;
	private String ville;
	
	public AdressePostale(int numRue, String libelleRue, String codePostal, String ville) {
		this.numRue = numRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
