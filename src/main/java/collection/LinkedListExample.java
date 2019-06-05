package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		System.out.println(l.remove(3));
	}
	
}
