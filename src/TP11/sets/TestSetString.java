package TP11.sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("USA");
	    set.add("France");
	    set.add("Allemagne");
	    set.add("UK");
	    set.add("Italie");
	    set.add("Japon");
	    set.add("Chine");
	    set.add("Russie");
	    set.add("Inde");
	    
	    System.out.println("HashSet : " + set);
	    
	    String max = "";
        for (String element : set) {
            if (element.length() > max.length()) {
                max = element;
            }
        }
	    set.remove(max);
        
	    System.out.println("Nouveau HashSet : " + set);
	}

}
