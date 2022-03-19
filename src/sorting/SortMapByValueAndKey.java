package sorting;

import java.util.*;
import java.util.Map.Entry;

class A {

	int key;

	@Override
	public String toString() {
		return "A [key=" + key + ", value=" + value + "]";
	}

	char value;

	A(char value, int key) {

		this.value = value;
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}

class Akey implements Comparator<A> {

	@Override
	public int compare(A o1, A o2) {
		// TODO Auto-generated method stub
		return o2.getKey() - o1.getKey();
	}

}

class AValue implements Comparator<A> {

	@Override
	public int compare(A o1, A o2) {
		// TODO Auto-generated method stub
		return o1.getValue() - o2.getValue();
	}

}

public class SortMapByValueAndKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<A> in = new ArrayList<>();

		in.add(new A('c', 4));
		in.add(new A('a', 5));
		in.add(new A('d', 2));
		in.add(new A('b', 2));

		Collections.sort(in, new Akey());

		for (A a : in) {
			System.out.println(a.toString());
		}
		System.out.println();
		
		Collections.sort(in,new Akey().thenComparing(new AValue()));
		
		for (A a : in) {
			System.out.println(a.toString());
		}
		/*
		 * List<Entry<Character,Integer>> re = new LinkedList<>(in.entrySet());
		 * 
		 * Collections.sort(re, new Comparator<Entry<Character,Integer>>() {
		 * 
		 * @Override public int compare(Entry<Character, Integer> o1, Entry<Character,
		 * Integer> o2) { // TODO Auto-generated method stub return
		 * o1.getValue().compareTo(o2.getValue()); } });
		 * 
		 * for(Entry<Character,Integer> entry : re) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 * 
		 * Collections.reverse(re);
		 * 
		 * for(Entry<Character,Integer> entry : re) {
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 * 
		 * /*Map<Character,Integer> ma = new TreeMap<Character, Integer>();
		 * 
		 * for(Entry<Character,Integer> entry : re) {
		 * ma.put(entry.getKey(),+entry.getValue()); }
		 * 
		 * for(char c : ma.keySet()) { System.out.println(c+" "+ma.get(c)); }
		 */
	}

}
