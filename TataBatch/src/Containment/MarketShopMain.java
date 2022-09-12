package Containment;

public class MarketShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Shop s=new Shop();
    s.setSno(0);
    s.setSname("MAULI");
    s.setStype("fashion ");
    
		Market m=new Market();
		m.setMarea(800);
		m.setMname("kkk");
	    m.setS(s);
		
		
	}

}
