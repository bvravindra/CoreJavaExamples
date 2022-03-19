package java8;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> in = Optional.empty();

	//	in = Optional.ofNullable(null);

		in = Optional.of(null);

		System.out.println(in.isEmpty());
		System.out.println(in.isPresent());
	//	System.out.println(in.get());
		
		OptionalInt iu = OptionalInt.empty();
	}

}
