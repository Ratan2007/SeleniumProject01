package seleniumProject01CreateUserAccount01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserAccount {
	@Test
	public  void CreateUser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SKRAT\\git\\SeleniumProject01\\seleniumProject01\\src\\test\\resources\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");

		System.out.println("This is Md hafizur Rahman");
		driver.close();
	
	
	}

}
