package fr.diginamic.TP_PO_V2;

public class Cercle extends Forme{
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double calculerPerimetre() {
		return this.rayon*2*Math.PI;
	}
	
	@Override
	public double calculerSurface() {
		return this.rayon*this.rayon*Math.PI;
	}
}
