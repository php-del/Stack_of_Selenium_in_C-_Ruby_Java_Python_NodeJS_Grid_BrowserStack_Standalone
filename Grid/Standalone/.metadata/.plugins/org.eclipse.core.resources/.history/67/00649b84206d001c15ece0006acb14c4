package Selenium_activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://codepen.io/GBora/pen/VLYyzY");
		driver.switchTo().frame("CodePen");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@frameborder=0]")));
		driver.findElement(By.xpath("//*[text()='HOME']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();
	}

}
