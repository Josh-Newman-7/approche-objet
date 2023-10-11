package TP10.listes;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<101;i++) {
			list.add(i);
		}
		System.out.println("Taille du tableau : "+ list.size());
	}

}
