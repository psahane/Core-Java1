package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverceSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String a="Java is a programming language";
			String str[]=a.split(" ");
			for(int i=0;i<str.length/2;i++)
			{
				String s=str[i];
				str[i]=str[str.length-(i+1)];
				str[str.length-(i+1)]=s;
			}
			System.out.println(Arrays.toString(str));
			char ch[]=a.toCharArray();
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr the charactor");
			char k=sc.next().charAt(0);
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==k)
				{
					count++;
					
				}
			}
			System.out.println(count+" ");
		}
	}


