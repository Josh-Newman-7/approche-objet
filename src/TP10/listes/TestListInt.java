package TP10.listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListInt {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		for(int i : list) {
			System.out.print(i +", ");
		}
		System.out.println();
		System.out.println("Taille de la liste : " + list.size());
		Collections.sort(list);
		System.out.println("Plus grand élément : " + list.get(list.size()-1));
		System.out.println("Suppression plus petit element : " + list.remove(0));
		for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element < 0) {
                list.set(i, Math.abs(element));
            }
        }
		for(int i : list) {
			System.out.print(i+", ");
		}
	}

}
