package arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepetedCharInString {

	public static void main(String[] args) {
		String s = "swiss";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(Character c: s.toCharArray()) {
			map.put(c, (map.getOrDefault(c, 0))+1);
		}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				return;
			}
		}
	}

}
