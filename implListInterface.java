package Project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class implListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<>();
		List<Integer> b = new LinkedList<>();
		List<Double> c = new Vector<>();
		List<Character> d = new Stack<>();
		b.add(1);
		a.add("what");
		c.add(0, 6.6);
		System.out.println(c.get(0));
		d.add('c');
		d.add('b');
		d.add('a');
		System.out.println(d.contains('a'));
		
		for(Object o: a)
			System.out.print(o);
		System.out.println();
		
		print(a);
		print(b);
		
	}

	private static <T> void print(List<T> list) {
		for(Object o: list)
			System.out.println(o);
	}

}
