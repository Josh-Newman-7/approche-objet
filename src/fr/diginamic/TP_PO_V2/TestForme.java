package fr.diginamic.TP_PO_V2;

public class TestForme {

	public static void main(String[] args) {
		Cercle c = new Cercle(15);
		Rectangle r = new Rectangle(5,3);
		Carre ca = new Carre(5);

		System.out.println(AffichageForme.afficher(c));
		System.out.println(AffichageForme.afficher(r));
		System.out.println(AffichageForme.afficher(ca));
	}

}
