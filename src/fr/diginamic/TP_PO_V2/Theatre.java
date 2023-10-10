package fr.diginamic.TP_PO_V2;

public class Theatre {
	private String name;
	private int max;
	private int inscription;
	private double recette;
	
	public void inscrire(int nbClient, double prix) {
		if(inscription + nbClient <= max) {
			inscription += nbClient;
			recette += (nbClient+prix);
		}else {
			System.out.println("Un message d'erreur");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getInscription() {
		return inscription;
	}

	public void setInscription(int inscription) {
		this.inscription = inscription;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(double recette) {
		this.recette = recette;
	}
}
