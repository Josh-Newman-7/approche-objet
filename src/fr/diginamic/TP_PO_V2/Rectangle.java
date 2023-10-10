package fr.diginamic.TP_PO_V2;

public class Rectangle extends Forme{

	protected double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		return 2*longueur+2*largeur;
	}

}
