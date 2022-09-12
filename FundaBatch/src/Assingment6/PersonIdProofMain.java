

/*
 * 3.	Create a class Person(id,name,contact,address,idproof[])
Create class IdProof (name,number,validity). Display all the persons name contact address who stay in pune and have adhaar card as idproof

 */
package Assingment6;

import java.util.Arrays;
import java.util.Scanner;

public class PersonIdProofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		Person p[]=new Person[3];
		for(int i=0;i<3 ;i++)
		{
			System.out.println("enter the id name,contact,address");
			int id=sc.nextInt();
			String name=sc.next();
			String contact=sc.next();
			String address=sc.next();
			
			IdProof idProof[]=new IdProof[1];
			for(int j=0;j<1;j++)
			{
				System.out.println("enter the name,number,validity");
				String named=sc.next();
				String number=sc.next();
				String validity=sc.next();
				
				IdProof d=new IdProof();
				d.setNamed(named);
				d.setNumber(number);
				d.setValidity(validity);
				idProof[j]=d;
			}
			Person r=new Person();
			r.setId(id);
			r.setName(name);
			r.setContact(contact);
			r.setAddress(address);
			r.setIdProof(idProof);
			p[i]=r;
		}
		System.out.println(Arrays.toString(p));
		for(Person k:p)
		{
			for(IdProof s:k.idProof)
			{
				if(s.getNamed().equals("adharcard") && k.getAddress().equals("pune"))
				{
					System.out.println(k.name+" "+k.contact+" "+k.address+" "+s.named);
				}
			}
		}
		sc.close();
	}

}



