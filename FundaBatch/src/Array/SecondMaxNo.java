package Array;

import java.util.Arrays;

public class SecondMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,0,31,45,100,1,105,90};  
		int length=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]>a[j+1])
				{
					int temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("second highest value: "+a[length-1]);
	}

}
