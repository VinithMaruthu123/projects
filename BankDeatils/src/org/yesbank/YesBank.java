package org.yesbank;

import org.unionbank.UnionBank;

public class YesBank extends UnionBank{
	public void accountInfo(String name) {
System.out.println("AC holder is :" + name);
super.accountInfo("max");
	}
    public void accountInfo(String name,int id) {
    	this.accountInfo("jack");
		// TODO Auto-generated method stub
    	System.out.println("AC  holder is:" + name +"\t"+ "account info :" + id);
    	super.accountInfo(43321); 

	}
    public static void main(String[] args) {
		YesBank y = new YesBank();
		y.accountInfo("jack", 1234);
		
	}
}
