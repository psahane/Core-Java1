package Assingment2;

import java.util.Scanner;

public class game {
	String game;
	void setdata(String g)
	{
		game=g;
		
		
	}
	void choice()
	{
		switch(game)
		{
		case "india":System.out.println("national game is hocky");
		              break;
		case "china":System.out.println("national game is table tennis");
        break;
		case "italy":System.out.println("national game is football");
        break;
		case "bangladesh":System.out.println("national game is kabddi");
        break;
		case "United States ":System.out.println("national game is base ball");
		
        break;
        default:
        	System.out.println("invalid choice ");
        	
        
		}
		
	}
	public String toString()
	{
		return game;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter your choice ");
    Scanner sc=new Scanner(System.in);
    
    String game;
    	
		System.out.println();
		game n=new game();
		game=sc.next();
		n.setdata(game);
		System.out.println();
		
		game n1=new game();
		game=sc.next();
		n1.setdata(game);
		System.out.println();
		
		game n2=new game();
		game=sc.next();
		n2.setdata(game);
		System.out.println();
		
		game n3=new game();
		game=sc.next();
		n3.setdata(game);
		System.out.println();
		
		
		System.out.println(n);
		n.choice();
		
		
		System.out.println(n1);
		n1.choice();
		
		System.out.println(n2);
		n2.choice();
		
		System.out.println(n3);
		n3.choice();
		
		
		
	}

}
