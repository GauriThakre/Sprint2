package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse {
	public static WebDriver driver;
	public static void gotourl(String url){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GATHAKRE\\Downloads\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get(url);//orangeHrm
	    driver.manage().window().maximize();  
	    }
	public static void main(String[] args) {
		
	}
	
}
