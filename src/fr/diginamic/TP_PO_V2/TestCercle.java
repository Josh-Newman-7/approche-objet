package fr.diginamic.TP_PO_V2;

public class TestCercle {

	public static void main(String[] args) {
		
		CercleViaFactory c1 = CercleFactory.creerCercle(5);
		CercleViaFactory c2 = CercleFactory.creerCercle(10);
		
		System.out.println("Cercle 1");
		System.out.println("Cercle 1 - Perimetre : " + c1.getPerimetre());
		System.out.println("Cercle 1 - Surface : " + + c1.getSurface());
		System.out.println();
		System.out.println("Cercle 2");
		System.out.println("Cercle 2 - Perimetre : " + c2.getPerimetre());
		System.out.println("Cercle 2 - Surface : " + + c2.getSurface());

	}

}
