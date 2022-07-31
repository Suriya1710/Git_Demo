package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupilicatesInArray {

	public static void main(String[] args) {
		Integer b[] = { 1, 2, 1, 3, 2 };

		// List<Integer> li = Arrays.asList(1,2,1,3,5,1,2,3,4,5);
		List<Integer> li = Arrays.asList(b);

		List<Integer> li1 = new ArrayList<Integer>();

		for (int i = 0; i < li.size(); i++) {
			for (int j = i + 1; j < li.size(); j++) {

				if (li.get(i) == li.get(j)) {
					if (li1.contains(li.get(j))) {
						continue;
						
					} else {
						li1.add(li.get(j));
					}
				}
			}
		}
		System.out.println(li1);
}
}
