package Org.company;


public class companyInfo {

	public  Object companyInfo (int age) {
		return age;
	}
	public String companyInfo(String name) {
		return name;
	}
	public  float companyinfo (float salary) {
	
	return salary;
	}
	public static void main(String[] args) {
		companyInfo c =new companyInfo();
		Object age = c.companyInfo(20);
		System.out.println(age+"\n"+"jygjugtkj");
		String name = c.companyInfo("hari");
		System.out.println(name);
		float s = c.companyinfo(634345);
		System.out.println("hari salary is "+s);
	}
	}
	
	
	
	
	
	
