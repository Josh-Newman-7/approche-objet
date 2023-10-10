package fr.diginamic.TP_PO_V2;

public class CercleViaFactory {
	private double rayon;
	
	public CercleViaFactory(double rayon) {
		this.rayon = rayon;
	}
	
	public double getPerimetre() {
		return this.rayon*2*Math.PI;
	}
	
	public double getSurface() {
		return this.rayon*this.rayon*Math.PI;
	}
}
