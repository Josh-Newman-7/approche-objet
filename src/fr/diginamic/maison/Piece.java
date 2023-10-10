package fr.diginamic.maison;

public abstract class Piece {
	private double superficie;
	private int etage;
	private String type;
	
	public Piece(double superficie, int etage, String type) {
		this.superficie = superficie;
		this.etage = etage;
		this.type = type;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	public String getType() {
        return type;
    }
}
