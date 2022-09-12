package ContainmentInheritanceAssin;

public class LapOsSetterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatingSystemSetter ok=new OperatingSystemSetter();
	    ok.setOsName("windowsn 10");
	    ok.setVendor("kk");
	    ok.setVersion(11.1);
	    
	    LaptopSetter l=new  LaptopSetter();
	    l.setBrand("Dell");
	    
	    l.setCost(35000);
	    
	}

}
