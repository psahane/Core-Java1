package Assingment8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Java is a programming language";
		String  str[]=a.split("");
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("a"))
			{
				str[i]="";
			}
		}
		System.out.println(Arrays.toString(str));
	}

}
