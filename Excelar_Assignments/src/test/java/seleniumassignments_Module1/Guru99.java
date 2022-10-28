package seleniumassignments_Module1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {
	public static void main(String[] args) {

		// setting driver property

		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// navigate to facebook
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		System.out.println("title of the page is : "+driver.getTitle());
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();
		System.out.println("radio button clicked");
		
		WebElement check_box1 = driver.findElement(By.id("vfb-6-1"));
		check_box1.click();
		System.out.println("radio check box 2 clicked");
		
		WebElement check_box2 = driver.findElement(By.id("vfb-6-2"));
		check_box2.click();
		System.out.println("radio check box 3 clicked");
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		System.out.println("navigated");
		
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("KUWAIT");
		System.out.println("selected KUWAIT");

		driver.quit();
		

	}

}
