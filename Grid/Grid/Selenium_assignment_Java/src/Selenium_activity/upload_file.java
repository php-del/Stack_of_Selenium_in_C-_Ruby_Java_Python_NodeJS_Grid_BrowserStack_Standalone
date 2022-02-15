package Selenium_activity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class upload_file {

  public static final String AUTOMATE_USERNAME = "pratikpathare_oMjcIz";
  public static final String AUTOMATE_KEY = "EeUYtZMrb6bLzmGQoszr";
  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("os", "windows");
    caps.setCapability("browser_version", "95.0");
    caps.setCapability("os_version", "10");
    caps.setCapability("browserstack.sendKeys", "true");
    caps.setCapability("browserstack.debug", "true");
    caps.setCapability("name", "PHP_Java_File_Upload");

    RemoteWebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
    driver.setFileDetector(new LocalFileDetector());
    driver.get("http://www.fileconvoy.com/");
    driver.findElement(By.id("upfile_0")).sendKeys("/Users/pratikhemantpathare/Desktop/Demo.txt");
    driver.findElement(By.name("upload_button")).submit();
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    
    driver.quit();
  }
}
