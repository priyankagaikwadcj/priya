package seleniumassignments_module2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// navigate to guru99
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
	
		WebElement col = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]"));
		System.out.println("No Of Coloumns are :"+col.getSize());
		
		
		WebElement rows = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("No Of rows are :"+rows.getSize());
		
		
	
	
	
	//driver.switchTo().window(( allWindows));

//	//clciking on HTML tables link on the new window 

//	WebElement html_table = driver.findElement(By.xpath("//*[@id="___gcse_0"]/div/div/div[1]/div[6]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a"));
//	html_table.click();
}
}
