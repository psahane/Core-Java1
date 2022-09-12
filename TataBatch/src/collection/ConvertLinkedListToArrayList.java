package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
	
	
	public void convertList()
	{
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertLinkedListToArrayList c=new ConvertLinkedListToArrayList();
		c.convertList();
	}

}
