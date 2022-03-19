package java8;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner sj = new StringJoiner(",", "(", ")");
		sj.add("ravi");
		System.out.println(sj.length());
		
	}

}
