
/**
 * @Author:sandhya
 * accepts the id and the age of people as a Map and decide if they are eligible for vote. 
 * A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list. 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map6 {
	public static void main(String args[]) {
		/**
		 * insert all value in map and call voterList () function and display detail
		 */
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(10, 20);
		map.put(11, 21);
		map.put(12, 12);
		map.put(13, 22);
		map.put(18, 70);
		Map6 m = new Map6();
		System.out.println(m.votersList(map));

	}

	public List<Integer> votersList(Map<Integer, Integer> m) {

		List<Integer> a = new ArrayList<Integer>();
		/**
		 * check the age is grater than 18 or not if age is more than 18 then display
		 * registration number otherwise registration number not show
		 */
		for (Map.Entry entry : m.entrySet()) {
			if ((int) entry.getValue() > 18) {
				a.add((int) entry.getKey());
			}
		}
		return a;
	}

}
