package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpération, double montant) {
		super(dateOpération, montant);
		
	}

	@Override
	public String getType() {
		return "DEBIT";
	}
}
