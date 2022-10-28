package com.Excekr.seleniumlearning_snapdeal_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\ExcelR_onlineClasses\\\\Tools\\\\browser_exce\\\\chromedriver_win32-103.0.5060.134\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		driver.get("https://www.snapdeal.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// finding computer & gaming using x path and click on it
		WebElement cg = driver.findElement(By.xpath("//div//li/a/span[normalize-space()='Computers & Gaming']"));
		cg.click();

		// clicking on storage by xpath
		WebElement storage = driver.findElement(By.xpath("//div//p//a/span[normalize-space()='Storage']"));
		storage.click();

		// scrolling down

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//scrolling up to click on view more
		WebElement view_more = driver.findElement(By.xpath("//button[@data-filtername='Capacity_s']"));
	    view_more.click();
		Thread.sleep(5000);
		
		//clicking on 16 bgb
		WebElement sixteen_gb = driver.findElement(By.xpath("//label[@for='Capacity_s-16GB']"));
		sixteen_gb.click();
		System.out.println("selected 16 gb");
		Thread.sleep(5000);
		
		WebElement view_more1 = driver.findElement(By.xpath("//button[@data-filtername='Capacity_s']"));
	    view_more1.click();
		Thread.sleep(5000);
		System.out.println("clciked on view more again");
		Thread.sleep(5000);
		
		
		//clickinh on 8gb
		WebElement eight_gb = driver.findElement(By.xpath("//label[@for='Capacity_s-8 GB']"));
		eight_gb .click();
	    System.out.println("selecteed 8 gb");
	    Thread.sleep(1000);
	    
	    WebElement clear_all = driver.findElement(By.xpath("//div[@class=' clr-btn-Advfilters ']//button[@class='clear-all-filters  btn-theme-secondary btn-line btn']"));
	    clear_all.click();
	    System.out.println("cleared all");
	    //cancel 16 gb
	    
		WebElement sixteen_gb_cancel = driver.findElement(By.xpath("//div[@class='filters-top-selected']//div[@class='filters']//div[@class='navFiltersPill']//a[@data-value='16%20GB']"));
		sixteen_gb_cancel.click();
		System.out.println("cancelled 16 gb");
		Thread.sleep(3000);
		
		//cancel 8 gb
		WebElement eight_gb_cancel = driver.findElement(By.xpath("//div[@class='filters-top-selected']//div[@class='filters']//div[@class='navFiltersPill']//a[@data-value='8%20GB']"));
		eight_gb_cancel.click();
		System.out.println("cancelled 8 gb");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
