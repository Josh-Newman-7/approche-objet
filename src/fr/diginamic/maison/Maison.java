package fr.diginamic.maison;

import java.util.ArrayList;
import java.util.List;

public class Maison {
    private List<Piece> pieces = new ArrayList<>();

    public void ajouterPiece(Piece piece) {
    	if(piece != null) {
    		if(piece.getSuperficie() >= 1) {
    			pieces.add(piece);
    		}else {
    			System.out.println("Données incohérentes");
    		}
    	}else {
    		System.out.println("Piece null");
    	}
    }

    public double getSuperficieTotale() {
        double superficieTotale = 0.0;
        for (Piece piece : pieces) {
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;
    }

    public double getSuperficieEtage(int etage) {
        double superficieEtage = 0.0;
        for (Piece piece : pieces) {
            if (piece.getEtage() == etage) {
                superficieEtage += piece.getSuperficie();
            }
        }
        return superficieEtage;
    }
    
    
    
    public double getSuperficieTypePiece(String typePiece) {
        double superficieTypePiece = 0.0;
        for (Piece piece : pieces) {
            if (piece.getType().equalsIgnoreCase(typePiece)) {
                superficieTypePiece += piece.getSuperficie();
            }
        }
        return superficieTypePiece;
    }

    public int getNombrePiecesType(String typePiece) {
        int nombrePiecesType = 0;
        for (Piece piece : pieces) {
            if (piece.getType().equalsIgnoreCase(typePiece)) {
                nombrePiecesType++;
            }
        }
        return nombrePiecesType;
    }
}
