package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOpération, double montant) {
		super(dateOpération, montant);
	}

	@Override
	public String getType() {
		return "CREDIT";
	}

	@Override
	public double adjust(double montant) {
		return montant += this.montant;
	}

	
}
