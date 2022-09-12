package collection;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l=new ArrayList<String>();
	       l.add("abc");
	       l.add("xyz");
	       l.add("kkk");

	       System.out.println("ArrayList before clear: "+l);
	       l.clear();
	       System.out.println("ArrayList after clear: "+l);

	}

}
