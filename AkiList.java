package Project;

import java.util.AbstractList;

public class AkiList<T> extends AbstractList<T>{

	private T[] akiList;
	
	public AkiList(){
		akiList = (T[]) new Object[0];
	}
	
	public AkiList(T[] list){
		akiList = list;
	}
	
	public void set(Object element){
		Object[] newAkiList = new Object[akiList.length + 1];
		for(int i = 0; i < akiList.length; i++){
			newAkiList[i] = akiList[i];
		}
		newAkiList[akiList.length] = element;
		akiList = (T[]) newAkiList;
	}
	
	public T [] get(){
		return akiList;
	}
	
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return akiList[index];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
