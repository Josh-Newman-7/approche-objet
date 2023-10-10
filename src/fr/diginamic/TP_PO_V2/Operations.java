package fr.diginamic.TP_PO_V2;

public class Operations {

	public static double calcul(double a, double b, char c) {
		if(c == '+') {
			return a+b;
		}
		if(c == '-') {
			return a-b;
		}
		if(c == '*') {
			return a*b;
		}
		if(c == '/') {
			return a/b;
		}
		return 0;
	}
}
