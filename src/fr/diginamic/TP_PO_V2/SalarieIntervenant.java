package fr.diginamic.TP_PO_V2;

public class SalarieIntervenant extends Intervenant {

	private double salaire;
	
	public SalarieIntervenant(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaire = salaireMensuel;
    }
	
	@Override
	public double getSalaire() {
		return salaire;
	}

}
