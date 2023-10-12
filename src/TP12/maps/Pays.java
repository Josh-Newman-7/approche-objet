package TP12.maps;

public class Pays {
	private String name;
	private String continent;
	private int nbHabitants;
	
	public Pays(String name, String continent, int nbHabitants) {
		this.name = name;
		this.continent = continent;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "Pays [name=" + name + ", continent=" + continent + ", nbHabitants=" + nbHabitants + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	
}
