package Selenium_activity;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class basicauth {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		
		
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		URL URL= new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(URL,caps);
		driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");


		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Authenticated");
		driver.quit();

	}

}
