package Pages;




	import Locators.Locators1;

	import java.sql.Driver;

	import Browser.Browse;
	public class Loginpage {
	public static void lpage(String url) {
		 Browse.gotourl(url);
			Locators1.username().sendKeys("Admin");
			Locators1.password().sendKeys("admin123");
		    Locators1.loginbtn().click();
	}
	public static void cpage(String url) {
		 Browse.gotourl(url);
			Locators1.username().sendKeys("Admin");
			Locators1.password().sendKeys("admin123");
		    //Locators1.loginbtn().click();
	}
	public static void lopage(String url,String username,String password) {
		 Browse.gotourl(url);
			Locators1.username().sendKeys(username);
			Locators1.password().sendKeys(password);
		    Locators1.loginbtn().click();
	}
	public static String geturl() {
		 String curl = Locators1.geturl();
		    return curl;
	}
	}



