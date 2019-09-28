package Project;

import java.util.LinkedList;
import java.util.List;

public class Testing4 {
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<>();
		list1.add("Prva");
		list1.add("Druga");
		list1.add("Brzina");
		list1.add("Direktno");
		list1.add("Bez Refrena");
		
		List<String> list2 = new LinkedList<>();
		list2.add("Direktno");
		
		list1.removeAll(list2);
		
		for (String temp : list1)
		System.out.printf(temp + " ");
		System.out.println();
		}
	}


