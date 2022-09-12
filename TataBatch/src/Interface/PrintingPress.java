package Interface;

public class PrintingPress {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
		Magzine m= new Magzine();
		m.read();
		m.write();
		m.update();
        System.out.println("---------------------------");
        m= new Magzine();
        m.read();
        m.update();
        m.write();
        */
		Book b=new Book(1,500,"gita","abc");
		System.out.println(b.toString());
        
		Magzine m= new Magzine(2,200,"kkk","xyz");
		m.publish("multiple publish ");
		m.read();
		m.update();
		m.write();
		
	}

}
