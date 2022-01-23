package week3.day1;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("4000");
		
	}

	public static void main(String[] args) {
		 AxisBank obj= new  AxisBank();
		 BankInfo obj1=new BankInfo();
		 obj.deposit();
		 obj.Saving();
		 obj.fixed();
		 obj1.deposit();

	}

}
