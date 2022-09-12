
package collection;
import java.util.ArrayList;

public class AddAllMeth_ex {

	public static void main(String[] args) {
		
		 ArrayList<String> a=new ArrayList<String>();
		 System.out.println("First List:");
         a.add("Rahul");
         a.add("Akash");
         a.add("Sanket");
        System.out.println(a);
         
         ArrayList<String> a1=new ArrayList<String>();
         System.out.println("Second List:");
         a1.add("Sagar");
         a1.add("Pravin");
         a1.add("Pratik");
         System.out.println(a1);
         a.addAll(a1);
         System.out.println("Join Two ArrayList:"+a);
         
	}

}
