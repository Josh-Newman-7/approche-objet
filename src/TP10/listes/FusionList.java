package TP10.listes;

import java.util.List;
import java.util.ArrayList;

public class FusionList {
	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		for(String s : liste1) {
			liste3.add(s);
		}
		for(String s : liste2) {
			liste3.add(s);
		}
	}
}
