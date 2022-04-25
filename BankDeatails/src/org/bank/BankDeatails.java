package org.bank;

public class BankDeatails extends BankDeatails2 implements BankDeatails4, BankDeatails5 {

	@Override
	void savings2() {
		// TODO Auto-generated method stub
		System.out.println("account is savings2");
	}

	@Override
	void current2() {
	
		// TODO Auto-generated method stub
		System.out.println("account is current2");
	}

	@Override
	void savings3() {
		// TODO Auto-generated method stub
		System.out.println("account is savings3");
	}

	@Override
	void current3() {
		// TODO Auto-generated method stub
		System.out.println("account is current3");
	}

	@Override
	public void savings5() {
		// TODO Auto-generated method stub
		System.out.println("account is savings 5");

	}

	@Override
	public void current5() {
		// TODO Auto-generated method stub

	}

	@Override
	public void savings4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void current4() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		BankDeatails B = new BankDeatails();
		B.savings2();
		B.current2();
		B.savings3();
		B.current3();
		B.savings4();
		B.current4();
		B.savings5();
		B.current5();
		B.stutentName();
		
	}
	

}
