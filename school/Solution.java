package com.sample.school;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List input = new ArrayList();
		input.add("a string");
		List sub = new ArrayList();
		sub.add("a");
		sub.add("b");
		input.add(sub);
		itemizeList("Example", input);
	}

	public static void itemizeList(String prefix, List input) {

		for (int i = 0; i < input.size(); i++) {
			Object obj = input.get(i);
			String localprefix = prefix + "." + i;
			if (obj instanceof List) {
				itemizeList(localprefix, (List) obj);
			} else if (obj instanceof String) {
				System.out.println(localprefix + ": " + obj);
			}
		}

	}

}
