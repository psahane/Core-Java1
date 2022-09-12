
package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Remove_FirstLastOccur {

	
	public void addInteger()
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		System.out.println("Remove first element:"+ l.removeFirstOccurrence(10));
		System.out.println("Remove Last element:"+l.removeLastOccurrence(50));
		System.out.println(l);
		
	}
	public static void main(String[] args) {
		Remove_FirstLastOccur r=new Remove_FirstLastOccur();
		r.addInteger();
	}

}
