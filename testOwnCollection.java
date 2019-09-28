package Project;

import java.util.Iterator;

public class testOwnCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ownCollectionFramework<Integer> aki = new ownCollectionFramework<>();
		aki.addValue(5);
		aki.addValue(9);
		aki.addValue(6);
		aki.addValue(9);
		aki.addValue(5);
		aki.addValue(3);
		aki.addValue(6);
		aki.addValue(7);
		
		for(int i = 0; i < aki.size(); i++){
		System.out.println(aki.get(i));
		}
		System.out.println();
		System.out.println(aki.set(3, 33));
		System.out.println();
		for(int i = 0; i < aki.size(); i++){
		System.out.println(aki.get(i));
		}
		
		Iterator it = aki.iterator();
		
		
	}

}
