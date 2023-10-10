package fr.diginamic.TP_PO_V2;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre t = new Theatre();
		t.setName("Trocadero");
		t.setMax(100);
		for(int i=0; i<20;i++) {
			int gens = (int) (Math.random()*10+1);
			t.inscrire(gens, 17.50);
		}
		System.out.println("Recette : "+t.getRecette());
		System.out.println("Nb Inscrits : "+t.getInscription());
	}

}
