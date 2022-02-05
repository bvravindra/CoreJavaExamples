package dataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringCombinationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		Set<String> result = StringCombinationTest.getAllPermutations(input);

		for (String rs : result) {
			System.out.println(rs);
		}
	}

	private static Set<String> getAllPermutations(String input) {

		Set<String> result = new HashSet<>();

		if (input == null) {
			return null;
		}
		else if (input.length() == 0) {
			result.add("");
			return result;
		}

		System.out.println("------- input " + input);
		char start = input.charAt(0);
		Set<String> ref = getAllPermutations(input.substring(1));

		for (String s : ref) {
			for (int i = 0; i <= s.length(); i++) {
				result.add(addSubString(s, start, i));
			}

		}

		return result;
	}

	private static String addSubString(String s, char start, int i) {

		String st = s.substring(0, i);
		String ed = s.substring(i);

		return st + start + ed;
	}

}
