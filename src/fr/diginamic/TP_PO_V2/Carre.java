package fr.diginamic.TP_PO_V2;

public class Carre extends Rectangle {
	
	public Carre(double longueur) {
		super(longueur,longueur);
	}

	@Override
	public double calculerSurface() {
		return super.longueur*super.longueur;
	}

	@Override
	public double calculerPerimetre() {
		return 4*super.longueur;
	}
}
