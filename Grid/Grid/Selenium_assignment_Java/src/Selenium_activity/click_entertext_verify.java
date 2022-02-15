package Selenium_activity;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class click_entertext_verify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.MAC);
		ChromeOptions options=new ChromeOptions();
		options.merge(caps);
		URL Url=new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(Url,options);
		
		
		driver.get("http://testyou.in/Login.aspx?ReturnUrl=%2fStudent%2fStudentIndex.aspx");
		driver.findElement(By.cssSelector(("#ctl00_CPHContainer_txtUserLogin"))).sendKeys("161295");
		driver.findElement(By.name("ctl00$CPHContainer$txtPassword")).sendKeys("apple@1234");
		driver.findElement(By.name("ctl00$CPHContainer$btnLoginn")).click();

		if((driver.findElement(By.xpath("//*[text()='Edit']"))).isDisplayed()) {
			System.out.println("Login successful");
		}
		else {
			System.out.print("Invalid");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
