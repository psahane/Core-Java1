package Agregation;

import java.util.Arrays;
import java.util.Scanner;

public class MoveActorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Move mov[]=new Move[2];
	for(int i=0;i<2;i++)
		{
		System.out.println("enter id,name,boxcollectoin  ");
		int id=sc.nextInt();
		String name=sc.next();
		int boxcollection=sc.nextInt();
		
		Actor act[]=new Actor[2];
	for(int j=0;j<2;j++)
		{
	   System.out.println("enter id,name,birthyear,address ");
			
		int Aid=sc.nextInt();
		String Aname=sc.next();
		int birthyear=sc.nextInt();
		String address=sc.next();
		
		Actor a1=new Actor();
		a1.setId(Aid);
		a1.setName(Aname);
		a1.setBirthyear(birthyear);
		a1.setAddress(address);
		act[j]=a1;
		
		}
		Move m1=new Move();
		m1.setId(id);
		m1.setName(name);
		m1.setAct(act);
		m1.setBoxcollection(boxcollection);
		mov[i]=m1;
		
	}
	System.out.println(Arrays.toString(mov));
	for(Move m:mov)
	{
		for(Actor a:m.act)
		{
			if(a.getName().equals("salmankhan") && m.getBoxcollection()>50000000)
			{
				System.out.println(m.name+"  "+a.name+" "+a.birthyear+" "+a.address);
			}
		}
	}
	sc.close();
		
	}

}
