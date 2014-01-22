package generic;

import java.util.ArrayList;

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<E>();
	
	public int getSize(){
		return list.size();
	}
	
	public E peek(){
		return list.get(getSize()-1);
	}
	
	public E pop(){
		E o = list.get(getSize()-1);
		list.remove(o);
		return o;
	}
	
	public void push(E e){
		list.add(e);
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
