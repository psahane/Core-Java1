package Assingment8;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "HELLO$WORLD";
		 char ch[]=str.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			if(ch[i]=='$')
			{
			ch[i]=' ';
			}
		 }

	        String s=new String(ch);

	        System.out.println(s);
	    }
	}


