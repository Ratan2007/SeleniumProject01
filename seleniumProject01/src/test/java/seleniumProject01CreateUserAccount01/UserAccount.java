package seleniumProject01CreateUserAccount01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKRAT\\eclipse-workspace02\\seleniumProject01\\src\\test\\resources\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
	
	
	
	}

}
