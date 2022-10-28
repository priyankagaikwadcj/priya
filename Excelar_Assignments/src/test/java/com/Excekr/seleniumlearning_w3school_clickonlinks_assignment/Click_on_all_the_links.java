package com.Excekr.seleniumlearning_w3school_clickonlinks_assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Click_on_all_the_links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		driver.get("https://www.w3schools.com/sql/default.asp");

		List<WebElement> allSQl_Links= driver.findElements(RelativeLocator.with(By.xpath("//a[contains(text(),'SQL')]"))
				.above(By.xpath("//h2[text()=' Database']")).below(By.xpath("//h2[text()=' Tutorial']")));
		System.out.println(allSQl_Links.size());
		
		for(int index=0; index<allSQl_Links.size(); index++) {
			allSQl_Links.get(index).click();
			System.out.println(index+" - "+driver.getTitle());
			allSQl_Links= driver.findElements(RelativeLocator.with(By.xpath("//a[contains(text(),'SQL')]"))
					.above(By.xpath("//h2[text()=' Database']")).below(By.xpath("//h2[text()=' Tutorial']")));
			
		}

try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
	
	
driver.quit();
		
		
	}
}
