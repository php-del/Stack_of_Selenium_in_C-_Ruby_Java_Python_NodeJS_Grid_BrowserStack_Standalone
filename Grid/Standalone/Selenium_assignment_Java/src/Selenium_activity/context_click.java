package Selenium_activity;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class context_click {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		URL URL= new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(URL,caps);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement elem = 	driver.findElement(By.xpath("//*[text()='right click me']"));
		Actions ac=new Actions(driver);
		ac.contextClick(elem);
		ac.perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
