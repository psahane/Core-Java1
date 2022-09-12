package ArrayListAssingment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public void showArr()
	
	{
		ArrayList<String> l=new ArrayList();
		l.add("Pravin");
		l.add("sahane");
		l.add("sagar");
		l.add("vaibhav");
		l.add("kale");
	
String str[]=l.toArray(new String [ l.size()]);
	System.out.println("convert  ArrayList toArray");
	for(String  s1:l)
	{
		System.out.println(s1);
	}
	System.out.println("convert  Array to ArrayList");
	List<String> l2=new ArraysString();
	l2=Arrays.asList(str);
	System.out.println(l2);
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
