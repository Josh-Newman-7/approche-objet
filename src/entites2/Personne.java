package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale add;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, AdressePostale addr) {
		this.nom = nom;
		this.prenom = prenom;
		this.add = addr;
	}
	
	public void id() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom.toUpperCase());
	}
	
	public void setName(String name) {
		this.nom = name;
	}
	public void setFirstName(String firstname) {
		this.prenom = firstname;
	}
	public void setAdress(AdressePostale addr) {
		this.add = addr;
	}
	
	public String getName() {
		return this.nom;
	}
	public String getFirstName() {
		return this.prenom;
	}
	public AdressePostale getAdress() {
		return this.add;
	}
}
