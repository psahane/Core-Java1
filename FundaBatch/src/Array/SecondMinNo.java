package Array;

import java.util.Arrays;

public class SecondMinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-20,0,-25,15,19,37,23};  
		int length=a.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length-1;j++)
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
		System.out.println("Second minimmum: "+a[1]);
	}

}
