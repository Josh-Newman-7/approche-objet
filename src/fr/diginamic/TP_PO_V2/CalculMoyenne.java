package fr.diginamic.TP_PO_V2;

import java.text.DecimalFormat;
import java.util.Arrays;

public class CalculMoyenne {
	double[] tab;
    private int nombreElements;

    public CalculMoyenne() {
        tab = new double[10];
        nombreElements = 0;
    }

    public void ajouterElement(double element) {
        if (nombreElements < tab.length) {
            tab[nombreElements] = element;
            nombreElements++;
        } else {
            double[] nouveauTableau = Arrays.copyOf(tab, tab.length * 2);
            tab = nouveauTableau;
            tab[nombreElements] = element;
            nombreElements++;
        }
    }
    
	public double calcul() {
		double somme = 0;
	    
	    for (int i = 0; i < nombreElements; i++) {
	        somme += tab[i];
	    }
	    double moyenne = (double) somme / this.nombreElements;
	    
	    //Arrondi de la Moyenne a un double de 2 décimals
	    DecimalFormat decimalFormat = new DecimalFormat("#.##");
	    String moyenneArrondie = decimalFormat.format(moyenne);
	    
	    return  Double.parseDouble(moyenneArrondie);
	}
}