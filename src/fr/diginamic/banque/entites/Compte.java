package fr.diginamic.banque.entites;

public class Compte {
	private int numCompte;
	private double solde;
	
	public Compte(int numeroCompte,double solde) {
		this.numCompte = numeroCompte;
		this.solde = solde;
	}
	
	public String toString() {
		return new String("Compte n°"+this.numCompte+", solde de : "+this.solde);
	}
}
