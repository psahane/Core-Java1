
package collection;

import java.util.*;

public class Convert_LinkToArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		ArrayList a=new ArrayList<>(l);
		System.out.println("After convert LinkedList to ArrayList:");
		System.out.println(a);
		
	}

}
