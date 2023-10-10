package fr.diginamic.TP_PO_V2;

public class TestOpérations {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		
		System.out.println("a + b = "+ Operations.calcul(a,b,'+'));
		System.out.println("a - b = "+ Operations.calcul(a,b,'-'));
		System.out.println("a * b = "+ Operations.calcul(a,b,'*'));
		System.out.println("a / b = "+ Operations.calcul(a,b,'/'));

	}

}
