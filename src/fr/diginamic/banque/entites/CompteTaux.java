package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double taux; 
	public CompteTaux(int numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.taux = taux;
	}
	public String toString() {
		return new String(super.toString() + ", Avec un taux de : "+this.taux);
	}
}
