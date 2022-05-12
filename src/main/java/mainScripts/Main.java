package mainScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
