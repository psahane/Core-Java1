package StringBufferBulder;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuffer s=new StringBuffer("Java");

		s.append(" Language");
		System.out.println(s);
		
		s.delete(1,3);
		System.out.println(s);
		
	}

}
