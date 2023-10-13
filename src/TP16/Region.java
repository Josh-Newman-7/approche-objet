package TP16;

public class Region {
    private String nomRegion;
    private int populationTotale;

    public Region(String nomRegion, int populationTotale) {
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

	@Override
	public String toString() {
		return "Region [nomRegion=" + nomRegion + ", populationTotale=" + populationTotale + "]";
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
}
