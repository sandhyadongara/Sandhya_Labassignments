
/**
 * Author:sandhya
 * hash map and return the values of the map in sorted order as a List.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Map1 {
	public static void main(String args[]) {
		/**
		 * HashMap declare and add value using put function
		 */
		// Comparator<Integer> comparator=new ValueComparator();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(14, 123);
		map.put(11, 3939);
		map.put(12, 12083);
		map.put(13, 3123);
		map.put(10, 737123);
		Map1 mapobj = new Map1();
		/**
		 * create list variable and call the getValues() function
		 */
		List<Integer> ret = mapobj.getValues(map);
		System.out.print(ret);
		/*
		 * for(Integer x:ret) { System.out.println(x); }
		 */
	}

	public List<Integer> getValues(Map<Integer, Integer> map) {
		/**
		 * create list variable and call the getValues() function
		 */
		List<Map.Entry<Integer, Integer>> forsort = new LinkedList<>(map.entrySet());
		/**
		 * comparing and sorted list
		 */
		Collections.sort(forsort, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		List<Integer> lista = new ArrayList<Integer>();
		for (Map.Entry<Integer, Integer> entry : forsort) {
			lista.add(entry.getValue());
		}

		return lista;
	}

}
