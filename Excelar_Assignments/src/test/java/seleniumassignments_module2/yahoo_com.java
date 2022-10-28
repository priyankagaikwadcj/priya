package seleniumassignments_module2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_com {
	//private static final List<WebElement> allInputElemets = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// navigate to yahoo
		driver.get("https://www.yahoo.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='yschsp']"));
		search.sendKeys("test");
		
		
		List<WebElement> allInputElements = (List<WebElement>) driver.findElement(By.xpath("//div//ul/li[@role='listbox']"));
		WebElement smallestElement = null;
		for(int i = 1;i<allInputElements.size();i++) {
			if (smallestElement == null) {
				smallestElement = allInputElements.get(i);
			}
			System.out.println(smallestElement.getText().length());
			if(allInputElements.get(i).getText().length()<smallestElement.getText().length()+1) {
				System.out.println("getText" + allInputElements.get(i).getText());
				smallestElement = allInputElements.get(i);
				
				
			}
		}

}
}
