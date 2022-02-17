package oops;

interface A {
	
	default void add() {
		System.out.println("a");
	}
}

interface B {
	
	default void add() {
		System.out.println("b");
	}
}
public class DimondProblemDemo implements B, A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DimondProblemDemo dd = new DimondProblemDemo();
		dd.add();
	}

	
	public void add() {
		// TODO Auto-generated method stub
		A.super.add();
	}

	
}
