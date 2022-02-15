package Selenium_activity;

import java.net.URL;
import java.util.List;
import java.util.logging.Level;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v85.log.model.LogEntry;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class print_log_console_error {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.MAC);
		ChromeOptions options=new ChromeOptions();
		options.merge(caps);
		URL Url=new URL("http://192.168.0.104:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(Url,options);
		
		
		
		driver.get("http://foo.com");
		
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
        // Retrieving all log 
        List<org.openqa.selenium.logging.LogEntry> logs= entry.getAll();
        // Print one by one
        for(org.openqa.selenium.logging.LogEntry e: logs)
        {
        	System.out.println(e);
        }
        
        // Printing details separately 
        for(org.openqa.selenium.logging.LogEntry e: logs)
        {
        	System.out.println("Message is: " +e.getMessage());
        	System.out.println("Level is: " +e.getLevel());
        }
		
		
		
		
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();
	}

}
