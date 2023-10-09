package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOpé;
	private double montant;
	
	public Operation(String dateOpération, double montant) {
		this.setDateOpé(dateOpération);
		this.setMontant(montant);
	}
	
	public abstract String getType();

	public String getDateOpé() {
		return dateOpé;
	}

	public void setDateOpé(String dateOpé) {
		this.dateOpé = dateOpé;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
