package Project;

import java.util.AbstractSet;
import java.util.Iterator;

public class ownCollectionFramework<T> extends AbstractSet<T> {

	private T[] a;
	private int index = 0;
	
	public ownCollectionFramework(T[] setList){
		a = setList;
	}
	
	public ownCollectionFramework(){
		a = (T[]) new Object[0];
	}
	
	public T get(int index){
		return a[index];
	}
	
	public T set(int index, T element){
		T oldElement = a[index];
		a[index] = element;
		return oldElement;
	}
	
	public void addValue(T value){
		while(!duplicate(value)){
		T[] newA = (T[]) new Object[index + 1];
		for(int i = 0; i < a.length; i++){
			newA[i] = a[i];
		}
		newA[index] = value;
		a = newA;
		index++;
		}
	}
	
	private boolean duplicate(T value) {
		for(int i = 0; i < a.length; i++)
			if(a[i].equals(value))
				return true;
		return false;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

	@Override
	public int size() {
		return a.length;
	}
}
