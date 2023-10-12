package TP15.fichier;

public class Ville {
	private String name;
	private String codeDepartement;
	private String nameRegion;
	private int population;
	
	public Ville(String name, String codeDepartement, String nameRegion, int population) {
		super();
		this.name = name;
		this.codeDepartement = codeDepartement;
		this.nameRegion = nameRegion;
		this.population = population;
	}
	
	@Override
	public String toString() {
		return "Ville [name=" + name + ", codeDepartement=" + codeDepartement + ", nameRegion=" + nameRegion + ", population=" + population + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}	
}
