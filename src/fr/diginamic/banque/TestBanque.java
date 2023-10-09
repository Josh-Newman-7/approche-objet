package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte = new Compte(123,12.25);
		System.out.println(compte);
		System.out.println(compte.toString());
	}

}
