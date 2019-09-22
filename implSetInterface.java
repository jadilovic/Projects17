package Project;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class implSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s1 = new HashSet<>();
		Set<String> s2 = new LinkedHashSet<>();
		Set<Double> s3 = new TreeSet<>();
		
		for(int i = 0; i < 6; i++){
			double num = (Math.random() * 100) + 1;
			num = Math.round(num);
			System.out.print(num + ", ");
			s1.add((int) num);
			s2.add(num + "");
			s3.add(num);
		}
		
		print(s1);
		print(s2);
		print(s3);
		
		s1.clear();
		print(s1);
	}

	private static <T> void print(Set<T> set) {
		System.out.println();
		for(T element: set)
			System.out.print(element + ", ");
	}

}
