package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpération, double montant) {
		super(dateOpération, montant);
	}

	@Override
	public String getType() {
		return "DEBIT";
	}
	
	@Override
	public double adjust(double montant) {
		return montant -= this.montant;
	}
}
