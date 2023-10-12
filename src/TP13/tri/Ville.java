package TP13.tri;

public class Ville implements Comparable<Ville> {

	private String name;
	private int nbHabitants;
	
	
	public Ville(String name, int nbHabitants) {
		this.name = name;
		this.nbHabitants = nbHabitants;
	}
	
	
	@Override
	public String toString() {
		return "Ville [name=" + name + ", nbHabitants=" + nbHabitants + "]";
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


	@Override
	public int compareTo(Ville o) {
		return Integer.compare(this.nbHabitants, o.getNbHabitants());
    }
}

