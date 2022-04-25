package org.lang;
// same package Child class
public class LanguageInfo {
	private void tamilLanguage() {
		System.out.println("tamil 10");

	}
private void englishLanguage() {
	System.out.println("english 15");
}
private void hindiLanguage() {
	System.out.println("hindi 17");

}
public static void main(String[] args) {
	LanguageInfo c=new LanguageInfo();
	c.tamilLanguage();
	c.englishLanguage();
	c.hindiLanguage();
	StateDetails d= new StateDetails();
    d.northIndia();
    d.southIndia();
}

}