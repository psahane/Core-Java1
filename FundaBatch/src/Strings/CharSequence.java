package Strings;

public class CharSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		String s2="By";
		String s3="Hi";
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		char c[]=s3.toCharArray();
		int j=0;
		int s=0;
		for(int i=0;i<a.length;i++)
			
		{
			System.out.println(""+a[i]);	
			
		
			
			if(j<b.length)
				
			{
				System.out.print(""+b[j]);
				j++;
			}
				
				if(s<c.length)
				{
				    System.out.print(""+c[s]);
					s++;
				}
			}
			
		System.out.println();
			
			
			
		
		
	}	

}
