package TP11.sets;

public class Pays {
	private String name;
	private int nbHabitants;
	private double pib;
	
	public Pays(String name, int nbHabitants, double pib) {
		super();
		this.name = name;
		this.nbHabitants = nbHabitants;
		this.pib = pib;
	}
	
	@Override
	public String toString() {
		return "Pays [name=" + name + ", nbHabitants=" + nbHabitants + ", pib=" + pib + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	public double getPib() {
		return pib;
	}
	public void setPib(double pib) {
		this.pib = pib;
	}
}
