package safari_driver_assignment_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class clickcheckboxandradiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver=new SafariDriver();
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
