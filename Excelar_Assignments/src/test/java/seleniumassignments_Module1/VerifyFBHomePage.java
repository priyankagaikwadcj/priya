package seleniumassignments_Module1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFBHomePage {
	public static void main(String[] args) {

		// setting driver property

		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// navigate to facebook
		driver.navigate().to("https://facebook.com");
		System.out.println("title of the page is : "+driver.getTitle());

		driver.quit();
		

	}

}
