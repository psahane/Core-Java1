package Assingment8;

import java.util.Arrays;

public class Encry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="THE SKY IS THE LIMIT";
		String ch[]=a.split(" ");
		int s[]=new int[ch.length];
		char c[]=a.toCharArray();
		 for(int i=0;i<ch.length;i++)
		    {
		    	int sum=0;
		    	for(int j=0;j<ch.length;j++)
		    	{
		    		sum=sum+((ch[i].charAt(j))-64);
		    	}
		    	s[i]=sum;
		    	System.out.println(ch[i]+" "+sum);
		    }
			
			for(int i=0;i<s.length;i++)
			{
				for(int j=i+1;j<s.length;j++)
					
				{
					if(s[i]>s[j])
					{
						int t=s[i];
						s[i]=s[j];
						s[j]=t;
						
						String k=ch[i];
						ch[i]=ch[j];
						ch[j]=k;
						
					}
				}
				System.out.println(s[i]+ " "+ch[i]);
			}
		//System.out.println(Arrays.toString(s));
//			 for (int i = 0; i < a.length(); i++)
//			 {
//			System.out.println(s[i]+""+ch[i]);
//		     }
	}
		
		
		
		
		

}
