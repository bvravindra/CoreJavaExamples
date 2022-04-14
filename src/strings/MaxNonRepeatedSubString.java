package strings;

public class MaxNonRepeatedSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "abcdaf";
		
		char[] in = input.toCharArray();
		String temp = "";
		int max = 0;
		for(int i=0; i< in.length; i++) {
			
			if(temp.contains(String.valueOf(in[i]))) {
				if(max < temp.length()) {
					max = temp.length();
				}
				
				temp = temp.substring(input.indexOf(in[i])+1);
				temp = temp+ String.valueOf(in[i]);
				
			}else {
				temp = temp + String.valueOf(in[i]);
			}
			if ((i == in.length - 1) && temp.length() > max) {
				max = temp.length();
			}

		}
		System.out.println(max);
	}

}
