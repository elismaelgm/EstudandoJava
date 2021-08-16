package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list;
	
	public PrintService() {
		this.list = new ArrayList<T>();
	}
	
	public void addValue(T value) {
		this.list.add(value);
	}
	
	public T first() {
		if (this.list.isEmpty()) {
			throw new IllegalStateException("List is Empty");
		}
		return this.list.get(0);
	}
	
	public void print() {
		System.out.println(this.list.toString());
	}
}
