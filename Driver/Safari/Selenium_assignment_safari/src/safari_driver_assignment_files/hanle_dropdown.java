package safari_driver_assignment_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class hanle_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver=new SafariDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement em=driver.findElement(By.xpath("//select"));
		Select s = new Select(em);
		s.selectByIndex(4);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
