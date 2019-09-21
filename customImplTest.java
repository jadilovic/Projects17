package Project;

import java.util.List;

public class customImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] sList = new String[3];
		sList[0] = "what";
		sList[1] = "is";
		sList[2] = "that";
		
		Integer[] iList = new Integer[3];
		iList[0] = 5;
		iList[1] = 10;
		iList[2] = 15;

		AkiList a1 = new AkiList(sList);
		a1.set("shit");
		sList = a1.get();
		write(sList);
		
		write(sList);
		write(iList);
		
		MyArrayList mArray = new MyArrayList(sList);
		System.out.println(mArray.set(2, "new"));
		for(int i = 0; i < mArray.size(); i++)
			System.out.print(mArray.get(i) + " ");
		System.out.println(mArray.size());
		//System.out.println(mArray.getClass().getName());
		System.out.println();
		MyArrayList iArray = (MyArrayList) mArray.asList(iList);
		//System.out.println(mArray.getClass().getName());
		for(int i = 0; i < iArray.size(); i++)
			System.out.print(iArray.get(i) + " ");
	}

	private static <T> void write(T[] list) {
		MyArrayList<T> mArray = new MyArrayList<T>(list);
		for(Object element: mArray)
			System.out.print(element + " ");
		System.out.println();
	}

}
