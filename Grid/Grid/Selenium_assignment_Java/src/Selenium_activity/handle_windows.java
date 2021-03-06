package Selenium_activity;

import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class handle_windows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.MAC);
		ChromeOptions options=new ChromeOptions();
		options.merge(caps);
		URL Url=new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(Url,options);
		
				driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[text()='    click   ']")).click();
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> sp=driver.getWindowHandles();
		Iterator<String> iterator = sp.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
               
            }
                try {
        			Thread.sleep(2000);
        		} catch (InterruptedException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
                driver.switchTo().window(mainWindowHandle);
                try {
        			Thread.sleep(2000);
        		} catch (InterruptedException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
                driver.quit();
	}

	}
}
