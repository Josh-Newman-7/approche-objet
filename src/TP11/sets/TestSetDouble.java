package TP11.sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<Double>();

		set.add(1.5);
	    set.add(8.25);
	    set.add(-7.32);
	    set.add(13.3);
	    set.add(-12.45);
	    set.add(48.5);
	    set.add(0.01);
	    
	    System.out.println("HashSet : " + set);
	    
	    /*Nombre Max du HashSet*/
	    double max = Double.MIN_VALUE;
        for (double element : set) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Max : " + max);
        
        /*Supprimer le plus petit element*/
        double min = Double.MAX_VALUE;
        double minElement = 0;
        Iterator<Double> iterator = set.iterator();
        while (iterator.hasNext()) {
            double element = iterator.next();
            if (element < min) {
                min = element;
                minElement = element;
            }
        }
        set.remove(minElement);

        System.out.println("Nouveau HashSet : " + set);
	}
}
