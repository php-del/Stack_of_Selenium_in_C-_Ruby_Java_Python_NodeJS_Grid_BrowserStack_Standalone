package safari_driver_assignment_files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class perform_scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();


	}

}
