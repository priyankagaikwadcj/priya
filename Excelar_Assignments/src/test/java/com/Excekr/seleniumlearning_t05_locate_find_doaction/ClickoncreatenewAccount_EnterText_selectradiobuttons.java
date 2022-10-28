package com.Excekr.seleniumlearning_t05_locate_find_doaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickoncreatenewAccount_EnterText_selectradiobuttons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		driver.get("http://fb.com");

		// click on create new account locate by id

		By locateCreateAccount = By.id("u_0_0_k+");

		// find element
		WebElement CreateAccount = driver.findElement(locateCreateAccount);

		// do actiction clcick on create new account

		CreateAccount.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		driver.quit();
	}

}
