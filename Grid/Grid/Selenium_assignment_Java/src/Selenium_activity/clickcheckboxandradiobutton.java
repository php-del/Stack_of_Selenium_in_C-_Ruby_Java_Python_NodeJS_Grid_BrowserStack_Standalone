package Selenium_activity;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class clickcheckboxandradiobutton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.MAC);
		ChromeOptions options=new ChromeOptions();
		options.merge(caps);
		URL Url=new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(Url,options);
		
		
		driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");

		driver.findElement(By.xpath("//*[@type='radio' and @value=8]")).click();
		driver.findElement(By.xpath("//*[@name='onions']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
