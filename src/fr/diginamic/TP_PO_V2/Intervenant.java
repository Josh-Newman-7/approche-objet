package fr.diginamic.TP_PO_V2;

public abstract class Intervenant {
	private String name;
	private String firstName;
	
	public Intervenant(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}
	
	public abstract double getSalaire();

	public void afficherDonnees() {
        System.out.println("Nom : " + name);
        System.out.println("Prénom : " + firstName);
        System.out.println("Salaire : " + getSalaire());
        System.out.println("Statut : " + this.getClass().getSimpleName());
    }
}
