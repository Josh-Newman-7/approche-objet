package TP16;

public class Departement {
    private String codeDepartement;
    private int populationTotale;

    public Departement(String codeDepartement, int populationTotale) {
        this.codeDepartement = codeDepartement;
        this.populationTotale = populationTotale;
    }

	@Override
	public String toString() {
		return "Departement [codeDepartement=" + codeDepartement + ", populationTotale=" + populationTotale + "]";
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

    
}