package strings;

public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String in = "ABC";

		printPermustation(in);
	}

	private static void printPermustation(String in) {

		permutations(in, "");
	}

	private static void permutations(String in, String perm) {

		if (in.isEmpty()) {
			System.out.println(perm);
		}		
		
		for(int i =0; i < in.length(); i++) {
			permutations(in.substring(0,i)+in.substring(i+1), perm+in.charAt(i));
		}
	}

}
