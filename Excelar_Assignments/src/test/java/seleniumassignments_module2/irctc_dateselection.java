package seleniumassignments_module2;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.it.Date;

public class irctc_dateselection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// navigate to irctc
		driver.get("https://www.irctc.co.in");

		// click on ok
		String xpathText_okbutton = "//button[text()='OK']";
		WebElement okbutton = driver.findElement(By.xpath(xpathText_okbutton));
		okbutton.click();

		// click on bus link
		String xpathText_buslink = "//li//span[@class='railDrishti fa fa-bus']";
		WebElement buslink = driver.findElement(By.xpath(xpathText_buslink));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", buslink);
		buslink.click();

		List<String>  allWindowsList = new ArrayList<>(driver.getWindowHandles());
		System.out.println(allWindowsList.size());
		driver.switchTo().window(allWindowsList.get(1));
		
		
		//selecting origin city
		
		WebElement depart_from = driver.findElement(By.xpath("//input[@id='departFrom']"));
		depart_from.sendKeys("Bengaluru");
		WebElement depart_from_list = driver.findElement(By.xpath("//li[@class='ui-menu-item']//div[normalize-space()='Bengaluru']"));
		depart_from_list.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("selected bengaluru as origin city");
		
		//selecting destination
		WebElement going_to = driver.findElement(By.xpath("//input[@id='goingTo']"));
		going_to.sendKeys("Mysore");
		WebElement going_to_list = driver.findElement(By.xpath("//li[@class='ui-menu-item']//div[normalize-space()='Mysore']"));
		going_to_list.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("selected Mysuru as destination");
		
		//selecting departure date
		WebElement departure_date = driver.findElement(By.xpath("//input[@id='departDate']"));
		departure_date.click();
		
		
	
			
		}

	
		
		
		 
//		
     //driver.quit()	;
}
