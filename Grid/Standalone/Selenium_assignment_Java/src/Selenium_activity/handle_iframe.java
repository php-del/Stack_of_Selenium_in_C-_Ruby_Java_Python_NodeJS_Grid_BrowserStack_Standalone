package Selenium_activity;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class handle_iframe {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub


		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		URL URL= new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(URL,caps);
		driver.get("https://codepen.io/GBora/pen/VLYyzY");
		driver.switchTo().frame("CodePen");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@frameborder=0]")));
		driver.findElement(By.xpath("//*[text()='HOME']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();
	}

}
