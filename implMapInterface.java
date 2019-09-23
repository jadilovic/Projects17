package Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class implMapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m1 = new HashMap<>();
		Map<Double, ArrayList<?>> m2 = new LinkedHashMap<>();
		Map<Character, String[]> m3 = new TreeMap<>();
		
		m1.put(1, "Krupa");
		m1.put(2, "Novi");
		m1.put(3, "Bihac");
		for(Map.Entry<Integer, String> list: m1.entrySet())
			System.out.print(list.getKey() + ": " + list.getValue() + "\n");
		
		System.out.println("Contains Key 2: " + m1.containsKey(2));
		System.out.println(m1.remove(2));
		System.out.println("Contains Key 2: " + m1.containsKey(2));
		
		System.out.println(m1.replace(1, "Krupa", "Bosanski"));
		for(Map.Entry<Integer, String> list: m1.entrySet())
			System.out.print(list.getKey() + ": " + list.getValue() + "\n");
		
		ArrayList<Object> li = new ArrayList<>();
		li.add("what");
		li.add(77);
		li.add(66.7);
		
		System.out.println(m2.put(4.4, li));
		m2.put(5.5, li);
		m2.put(6.6, li);
		for(Map.Entry<Double, ArrayList<?>> element: m2.entrySet()){
			System.out.print(element.getKey() + ": ");
			ArrayList<?> values = element.getValue();
		for(Object o: values)
			System.out.print(o + " ");
		System.out.println();
		}
		
		String[] name = {"bob", "mom", "vom", "kok"};
		m3.put('v', name);
		m3.put('d', name);
		m3.put('c', name);
		m3.put('i', name);
		
		for(Map.Entry<Character, String[]> list: m3.entrySet()){
			System.out.print(list.getKey() + ": ");
			String[] names = list.getValue();
			for(String nam: names)
			System.out.print(nam + ", ");
			System.out.println();
		}
	}
}
