package fr.diginamic.TP_PO_V2;

public class CercleFactory {
	public static CercleViaFactory creerCercle(double rayon) {
		return new CercleViaFactory(rayon);		
	}
}
