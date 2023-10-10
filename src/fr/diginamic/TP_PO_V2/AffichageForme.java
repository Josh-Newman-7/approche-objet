package fr.diginamic.TP_PO_V2;

public class AffichageForme {

	public static String afficher(Forme f) {
		return new String("Perimetre : " + f.calculerPerimetre()+" ; Surface : "+f.calculerSurface());
	}
}
