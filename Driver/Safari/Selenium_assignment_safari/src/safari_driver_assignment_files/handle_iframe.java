package safari_driver_assignment_files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class handle_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Complete_assignment_web_page.html");
		//driver.switchTo().frame("CodePen");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width=500 and @src='file:///Users/pratikhemantpathare/Desktop/Assignment%20HTML/Form_User_Name_Password.html']")));
		List<WebElement> dem= driver.findElements(By.xpath("//*[@name='User Name']"));
		
		dem.get(0).sendKeys("ter");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();
	}

}
