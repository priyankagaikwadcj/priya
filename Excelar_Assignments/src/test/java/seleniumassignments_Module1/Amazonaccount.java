package seleniumassignments_Module1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonaccount {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.navigate().to("https://amazon.in");
		
		System.out.println("pgae title is : "+driver.getTitle());
    
		
		driver.quit();
	}
}
