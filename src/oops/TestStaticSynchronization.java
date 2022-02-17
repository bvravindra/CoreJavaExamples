package oops;

class Table {
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}

	synchronized void print(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}

}

class MyThread1 extends Thread {
	public void run() {
		Table.printTable(1);
	}
}

class MyThread2 extends Thread {
	public void run() {
		Table.printTable(5);
	}
}

class MyThread3 extends Thread {
	public void run() {
		Table.printTable(10);
	}
}

class MyThread4 extends Thread {

	public void run() {
		new Table().print(1);
	}
}

class MyThread5 extends Thread {
	public void run() {
		new Table().print(5);
	}
}

class MyThread6 extends Thread {

	private Table t;

	MyThread6(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(1);
	}
}

class MyThread7 extends Thread {
	private Table t;

	MyThread7(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(5);
	}
}

public class TestStaticSynchronization {
	public static void main(String args[]) {

//		MyThread1 t1 = new MyThread1();
//		MyThread2 t2 = new MyThread2();
//		MyThread3 t3 = new MyThread3();

//		MyThread4 t4 = new MyThread4();
//		MyThread5 t5 = new MyThread5();

		Table t = new Table();
		MyThread6 t6 = new MyThread6(t);
		MyThread7 t7 = new MyThread7(t);

//		t1.start();
//		t2.start();
//		t3.start();
//
//		t4.start();
//		t5.start();
		
		t6.start();
		t7.start();

	}
}
