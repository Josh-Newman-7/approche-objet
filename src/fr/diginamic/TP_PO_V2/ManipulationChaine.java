package fr.diginamic.TP_PO_V2;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char firstChar = chaine.charAt(0);
		System.out.println("1st Char : " + firstChar);
		System.out.println("Taille chaine : " + chaine.length());
		System.out.println("indexOf(';') : " + chaine.indexOf(';'));
		String name = chaine.substring(chaine.indexOf(firstChar),chaine.indexOf(';'));
		System.out.println("subString : " + name);
		System.out.println("subString : " + name.toUpperCase());
		System.out.println("subString : " + name.toLowerCase());
		String[] tab = chaine.split(";");
		for (String morceau : tab) {
            System.out.println(morceau);
        }
		tab[2] = tab[2].replace(" ","");
		Salarie salarie = new Salarie(tab[0],tab[1],Double.parseDouble(tab[2]));
		System.out.println(salarie.toString());
	}

}
