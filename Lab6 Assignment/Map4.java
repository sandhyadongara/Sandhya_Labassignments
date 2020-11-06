
/*Author:sanhdya
		 * school offers medals to the students of tenth based on the following criteria 
		 * If(Marks>=90) : Gold 
		 * If(Marks between 80 and 90) : Silver 
		 * If(Marks between 70 and 80) : Bronze*/

import java.util.HashMap;
import java.util.Map;

public class Map4 {
	public static void main(String args[]) {

		Map4 m = new Map4();
		Map<Integer, Integer> p = new HashMap<Integer, Integer>();
		/**
		 * put student registration number and marks call the getStudent() function and
		 * print the medal details according to the marks
		 */
		p.put(1234, 90);
		p.put(1235, 86);
		p.put(1236, 76);
		p.put(1237, 70);
		p.put(1238, 77);
		// System.out.println(m.getStudents(p));
		Map<Integer, String> map = m.getStudents(p);
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}
	}

	public Map<Integer, String> getStudents(Map<Integer, Integer> l) {
		Map<Integer, String> ret = new HashMap<Integer, String>();
		/**
		 * check the marks if the marks is more than 90 then display gold medal if the
		 * marks is greater than 80 and less than 90 then display silver medal if the
		 * marks is greater than 70 and less than 80 then display Bronze
		 */
		for (Map.Entry entry : l.entrySet()) {
			if ((int) entry.getValue() >= 90) {
				ret.put((Integer) entry.getValue(), "Gold");
			} else if ((int) entry.getKey() >= 80 && (int) entry.getKey() < 90) {
				ret.put((int) entry.getValue(), "Silver");
			} else {
				ret.put((int) entry.getValue(), "Bronze");
			}
		}
		return ret;
	}

}
