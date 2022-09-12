package InnerClass;

public class BankInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank("SBI","SBI124536");
		Bank.Loker  lo=b.new Loker(123,"pune");
		b.ShowDetail();
        lo.LokerInfo();
        
		
	}

}
