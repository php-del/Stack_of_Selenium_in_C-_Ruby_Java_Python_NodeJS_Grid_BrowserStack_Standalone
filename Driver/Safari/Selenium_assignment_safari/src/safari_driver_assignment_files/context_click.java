package safari_driver_assignment_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class context_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver=new SafariDriver();
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
