package java8;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<>();
		li.add("aabc");
		li.add("acbc");
		li.add("aabbc");
		li.add("baabc");
		
		String pre ="aa";
		
	List<String> l1=	li.stream().filter(m -> m.substring(0, pre.length()).equalsIgnoreCase(pre))
		.collect(Collectors.toList());
	
	List<String> l2 = li.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	
	l1.forEach(s -> System.out.println(s));
	l2.forEach(s -> System.out.println(s));
	
	}

}
