package com.qatechie.dynamicjsonparsing;

import java.util.HashMap;
import java.util.Map;

public class Utility {

	public static Map<String, String> getUnquotedJsonIntoMap(String s) {
		Map<String, String> map = new HashMap<>();
		if (s != null && !s.isEmpty()) {
			s = s.trim();
			s = s.replaceAll("\\s+", "");

			String[] arr = s.split(",");
			for (int i = 0; i < arr.length; i++) {
				String[] stArr = arr[i].split("#");
				if (stArr.length > 1) {
					map.put(stArr[0], stArr[1]);
				} else if (stArr.length > 0) {
					map.put(stArr[0], "");
				}
			}

		}
		return map;
	}

}
