package StringBufferBulder;

public class Demo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

StringBuffer sbf=new StringBuffer("Java");
		
		  sbf.length();
        System.out.println(sbf);
		
     	String s=new String("Java");
		s.concat("Language");
		System.out.println(s);
		
        sbf.reverse();
		System.out.println(sbf);
		
    	sbf.replace(5, 8, "LAN");
		System.out.println(sbf);
		
		
		sbf.delete(2, 4);
//		System.out.println(sbf);
		
		
//		sbf.deleteCharAt(5);
//		System.out.println(sbf);
		
//       sbf.insert(5, 3.5f);
//       System.out.println(sbf);
		
	}



	}


