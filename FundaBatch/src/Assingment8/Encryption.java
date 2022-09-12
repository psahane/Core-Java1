package Assingment8;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="THE SKY IS THE LIMIT";
	    String ch[]=a.split(" ");
	    for(int i=0;i<ch.length;i++)
	    {
	    	int sum=0;
	    	for(int j=0;j<ch[i].length();j++)
	    	{
	    		sum=sum+((ch[i].charAt(j))-64);
	    	}
	    	System.out.println(ch[i]+" "+sum);
	    }
		
		
	}

}
