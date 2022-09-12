package Containment;

public class BHMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		OutHous o=new OutHous(101,"sahane");
		Banglo b=new Banglo("pravin",800,o);
		System.out.println(b);
		*/
		OutHous o=new OutHous();
		o.setHid(101);
		o.setHname("pravin");
		Banglo b=new Banglo();
		
		b.setOwner("sahane");
		b.setArea(800);
		b.setT(o);
		System.out.println(b);
	}

}
