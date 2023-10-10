package fr.diginamic.maison;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        maison.ajouterPiece(new Salon(30.0, 0));
        maison.ajouterPiece(new Chambre(15.0, 1));
        maison.ajouterPiece(new Cuisine(12.0, 0));
        maison.ajouterPiece(new SalleDeBain(8.0, 1));
        maison.ajouterPiece(new Chambre(18.0,1));
        maison.ajouterPiece(new WC(5.0, 1));
        
        maison.ajouterPiece(null);
        maison.ajouterPiece(new Salon(-50.0,1));

        double superficieTotale = maison.getSuperficieTotale();
        System.out.println("Superficie totale de la maison : " + superficieTotale + " m²");

        double superficieEtage1 = maison.getSuperficieEtage(1);
        System.out.println("Superficie de l'étage 1 : " + superficieEtage1 + " m²");
        
        double superficieChambres = maison.getSuperficieTypePiece("Chambre");
        System.out.println("Superficie des chambres : " + superficieChambres + " m²");

        int nombreChambres = maison.getNombrePiecesType("Chambre");
        System.out.println("Nombre de chambres : " + nombreChambres);
    }
}
