package set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		
		
		Set<Integer> a =  new TreeSet<Integer>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b =  new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));
		
		//Union
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersect
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b);
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b);
		System.out.println(e);
		
	}
}
