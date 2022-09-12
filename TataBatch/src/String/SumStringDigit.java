package String;

public class SumStringDigit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="pra4sa5jdh9nd3";
		char[] c=str.toCharArray();
		
	int sum=0;
	for(int i=0;i<c.length;i++)
	{
		if(Character.isDigit(c[i]))
		{
			System.out.println("Digit String is "+c[i]);
			System.out.println();
			int a=Integer.parseInt(String.valueOf(c[i]));
			sum=sum+a;
			
		}
		
		
		}
	System.out.println("sum of digit ="+sum);
	}

}
