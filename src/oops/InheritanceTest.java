package oops;

class Maths {
	static int sub(int a, int b) {
		System.out.println("super");
		return a - b;
	}

	private void add(int a, int b) {
		System.out.println("super");
		System.out.println(a + b);
	}
}

class Arthematic extends Maths {
	static int sub(int a, int b) {
		System.out.println("sub");
		return a - b;
	}

	 void add(int a, int b) {
		System.out.println("sub");
		System.out.println(a + b);
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Maths m = new	Arthematic();
	m.sub(3, 3); // super method will execute , override not working 
//	m.add(2,3); compile time error
	
	Arthematic a = new Arthematic();
	a.add(2, 2);
	a.sub(4, 3);
	
	}

}
