package fr.diginamic.TP_PO_V2;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne tab = new CalculMoyenne();
		tab.ajouterElement(5);
		tab.ajouterElement(10);
		tab.ajouterElement(0);
		tab.ajouterElement(15);
		tab.ajouterElement(20);
		
		System.out.println(tab.calcul());
		
		tab = new CalculMoyenne();
		tab.ajouterElement(1);
		tab.ajouterElement(2);
		tab.ajouterElement(3);
		tab.ajouterElement(4);
		tab.ajouterElement(5);
		
		System.out.println(tab.calcul());
	}

}
