package Interface;

public class Student implements Addmition,College {

	public void idCard() {
		System.out.println("ID card are taken From College");
	}

	public void uniform() {
		System.out.println("College has uniform");
	}

	public void markSheetSSC() {
		System.out.println("SSC mark sheet: ");
	}

	public void markSheetHSC() {
		System.out.println("HSC marksheet: ");
	}

	public void nationality() {
		System.out.println("Nationality : ");
	}

	public void leavingCertificate() {
		System.out.println("LeavingCertificate: ");
	}

	public void adharCard() {
		System.out.println("AdharCard: ");
	}

	@Override
	public void unifrom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void marksheetHSC() {
		// TODO Auto-generated method stub
		
	}
	
}


