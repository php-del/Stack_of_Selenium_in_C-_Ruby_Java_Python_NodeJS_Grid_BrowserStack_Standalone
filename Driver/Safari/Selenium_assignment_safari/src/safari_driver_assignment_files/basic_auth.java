package safari_driver_assignment_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.safari.SafariDriver;

public class basic_auth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		
		WebDriver driver=new SafariDriver();
		
		driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");


		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
