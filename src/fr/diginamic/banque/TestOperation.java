package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation[] tab = new Operation[8];
		tab[0]= new Credit("Credit 1", 0.5);
		tab[1]= new Credit("Credit 2", 1);
		tab[2]= new Credit("Credit 3", 1.5);
		tab[3]= new Credit("Credit 4", 2);
		tab[4]= new Debit("Débit 1", 2.5);
		tab[5]= new Debit("Débit 2", 3);
		tab[6]= new Debit("Débit 3", 3.5);
		tab[7]= new Debit("Débit 4", 4);
		
		for(Operation i : tab) {
			System.out.println(i.getDateOpé());
			System.out.println(i.getMontant());
			System.out.println(i.getType());
			System.out.println();
		}
		
		double montant = 0;
		for(Operation i : tab) {
			montant = i.adjust(montant);
			System.out.println("Montant = "+montant);
		}
		System.out.println("Montant = "+montant);
	}

}
