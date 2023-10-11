package TP10.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		List<String> listVilles = new ArrayList<String>();

        listVilles.add("Nice");
        listVilles.add("Carcassonne");
        listVilles.add("Narbonne");
        listVilles.add("Lyon");
        listVilles.add("Foix");
        listVilles.add("Pau");
        listVilles.add("Marseille");
        listVilles.add("Tarbes");
        

        String villeLongue = "";
        for (String ville : listVilles) {
            if (ville.length() > villeLongue.length()) {
                villeLongue = ville;
            }
        }
        System.out.println("Ville avec le plus grand nombre de lettres : " + villeLongue);

        
        for (int i = 0; i < listVilles.size(); i++) {
            listVilles.set(i, listVilles.get(i).toUpperCase());
        }

        /*StackOverFlow pour la commande*/
        /*https://stackoverflow.com/questions/13316629/remove-objects-from-an-arraylist-based-on-a-given-criteria/47833790*/
        listVilles.removeIf(ville -> ville.startsWith("N"));

        System.out.println(listVilles);

	}

}
