package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] tabComptes = new Compte[2];
		tabComptes[0] = new Compte(0,1500.0);
		tabComptes[1] = new CompteTaux(1,2200.0,0.8);
		
		for(Compte c : tabComptes) {
			System.out.println(c.toString());
		}
		
		Compte compte = new Compte(123,12.25);
		System.out.println(compte);
		System.out.println(compte.toString());
	}

}
