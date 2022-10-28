package com.Excekr.seleniumlearning_t05_locate_find_doaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText_fb_UserID_TextBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// waiting here to sync web and eclipse time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		driver.get("http://fb.com");

		// observe html page / web page

		// locate by using any of the 8 tech

		By locateUserID = By.id("email");

		// find element

		WebElement UserId = driver.findElement(locateUserID);

		// perform actions

		UserId.sendKeys("priyanka");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		WebElement UserId_2 = driver.findElement(By.id("email"));
		UserId_2.clear();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.quit();
	}

}
