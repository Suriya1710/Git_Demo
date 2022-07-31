package com.java.programs;

//import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapPractise2 {

	public static void main(String[] args) {

		String s = "Of The People By The People For The People";

		String[] split = s.split(" ");

		Map<String, Integer> m = new TreeMap<String, Integer>();

		for (String sentence : split) {

			if (m.containsKey(sentence)) {
				//Integer integer = m.get(sentence);
				m.put(sentence, m.get(sentence)+1);
			} else {
				m.put(sentence, 1);
			}
			//System.out.println(m);

		}

		/*
		 * for (String string : split) {
		 * 
		 * if (m.containsKey(string)) {
		 * 
		 * Integer integer = m.get(string);
		 * 
		 * 
		 * m.put(string,integer+1 );
		 * 
		 * 
		 * } else {
		 * 
		 * m.put(string, 1);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(m);
		 * 
		 */
//for entry set		

		
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();

		for (Entry<String, Integer> entry : entrySet) {

			if (entry.getValue() >= 1) {

				System.out.println(entry);
			}

		}
	}
}
