package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReverse{

	public void addString(ArrayList<String> l)
	{
		l.add("pravin");
		l.add("sahane");
		l.add("sagar");
		l.add("vaibhav");
		l.add("prasad");
		l.add("kale");
		
	}
	
	public void reverse(ArrayList<String> l)
	{
		for(int  i=l.size()-1;i>=0;i++)
		{
			System.out.println(l.get(i));
		}
	System.out.println();
		revString(l);
	}
	
	
	public void revString(ArrayList<String> l)
	{
		System.out.println("Reverse String is:");
		for(int  i=l.size()-1;i>=0;i--)
		{
			System.out.println(l.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l=new ArrayList<String>();
		 ArrayListReverse o=new  ArrayListReverse();
		 o.addString(l);
		
	}

}
