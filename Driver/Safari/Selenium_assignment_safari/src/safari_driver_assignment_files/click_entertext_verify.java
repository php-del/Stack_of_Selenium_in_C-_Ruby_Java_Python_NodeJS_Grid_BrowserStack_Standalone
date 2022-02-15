package safari_driver_assignment_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class click_entertext_verify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.get("http://testyou.in/Login.aspx?ReturnUrl=%2fStudent%2fStudentIndex.aspx");
		driver.findElement(By.cssSelector(("#ctl00_CPHContainer_txtUserLogin"))).sendKeys("161295");
		driver.findElement(By.name("ctl00$CPHContainer$txtPassword")).sendKeys("apple@1234");
		driver.findElement(By.name("ctl00$CPHContainer$btnLoginn")).click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if((driver.findElement(By.xpath("//*[text()='Edit']"))).isDisplayed()) {
			System.out.println("Login successful");
		}
		else {
			System.out.print("Invalid");
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
