package seleniumassignments_module2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_com {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\chromedriver_win32-103.0.5060.134\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		// navigate to naukri.com

		driver.get("https://www.naukri.com");
		System.out.println("navigated to desired site");
		WebElement register = driver.findElement(By.xpath("//div[normalize-space()='Register']"));
		register.click();

		// switching window
		List<String> allWindowsList = new ArrayList<>(driver.getWindowHandles());
		System.out.println(allWindowsList.size());
		driver.switchTo().window(allWindowsList.get(1));
		System.out.println("switched window");

		// clcicking on upload resume

		WebElement Upload_file = driver.findElement(By.xpath("//button[@type='button']"));
		Upload_file.click();
		System.out.println("clcicked on Upload resume");

		// switch to frame

		driver.switchTo().frame(0);
		System.out.println("switched");

		// uploading file using robot class

		try {
			Robot r = new Robot();

			// storing path of file to be uploaded

			StringSelection filepath = new StringSelection(
					"C:\\ExcelR_onlineClasses\\Notes\\31_07_2022_Switches_In_Selenium.txt");

			// copy path to clipboard

			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

			// press control v

			r.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);

			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);

			// press enter

			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);

			// releasing keys

			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);

			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
		} catch (AWTException e) {
			e.printStackTrace();
		}

		// switching back to parent frame

		driver.switchTo().parentFrame();

		// validating error msg

		String actualMsg = driver.findElement(By.xpath("//div[@class='info out err-label']")).getText();
		System.out.println(" " + actualMsg);

		driver.quit();
	}
}