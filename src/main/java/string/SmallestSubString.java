package string;

import java.util.*;

class SmallestSubString {

	static String getShortestUniqueSubstring(char[] arr, String str) {
		String s = "hello";
		int count = arr.length;
		int a[] = new int[26];
		if (str.length() == 0) {
			return "";
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arr) {
			map.put(c, 0);
		}

		for (int i = 0, j = 0; i < str.length() || j < str.length();) {
			if (count == 0) {
				if (s.length() == 0 || s.length() > str.substring(i, j).length()) {
					s = str.substring(i, j);

				} else {
					if (map.containsKey(str.charAt(i))) {
						if (map.get(str.charAt(i)) == 1)
							count++;

						map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
						i++;
					} else {
						i++;
					}

				}

			} else {
				if (j > str.length() - 1 && count > 0)
					break;
				if (map.containsKey(str.charAt(j))) {
					if (map.get(str.charAt(j)) == 0)
						count--;
					map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
					j++;
					if (count == 0)
						if (s.length() == 0 || s.length() > str.substring(i, j).length())
							s = str.substring(i, j);
				} else {

					j++;
				}

			}
		}

		return s;
	}

	public static void main(String[] args) {
		char[] arr = { 'x', 'y', 'z' };
		System.out.println(getShortestUniqueSubstring(arr, "xyyzyzyx"));

	}

}