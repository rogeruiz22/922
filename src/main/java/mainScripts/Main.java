package mainScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://teamorg2-dev-ed.my.salesforce.com/");
		
		WebElement usernameBox = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordBox = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		
		usernameBox.sendKeys("incubatorteam@oktana.com");
		passwordBox.sendKeys("incubator2022");
		
		loginButton.click();
		
		Thread.sleep(7000);
		
		driver.quit();
	}

}
