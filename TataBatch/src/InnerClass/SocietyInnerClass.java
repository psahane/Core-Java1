package InnerClass;

public class SocietyInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Society s=new Society(123, "kkk");
		Society.Flat f=s.new Flat(101,"sss");
	    f.showInfo();
		
	}

}
