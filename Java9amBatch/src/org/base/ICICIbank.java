package org.base;

public class ICICIbank implements Citibank  {

	@Override
	public void saving() {
		System.out.println("citi bank saving : 5%");
	}

	@Override
	public void deposite() {
		System.out.println("citi bank deposite : 9%");
	}

	@Override
	public void fixed() {
		System.out.println("citi bank fixed : 7%");
		
	}
public static void main(String[] args) {
	ICICIbank S = new ICICIbank();
	S.saving();
	S.deposite();
	S.fixed();
}
	}


