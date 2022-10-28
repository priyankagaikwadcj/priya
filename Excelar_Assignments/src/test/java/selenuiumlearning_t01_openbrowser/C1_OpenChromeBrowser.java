package selenuiumlearning_t01_openbrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class C1_OpenChromeBrowser {
	public static void main(String[] args) {
		System.out.println("");

		System.setProperty("webdriver.edge.driver",
				"C:\\ExcelR_onlineClasses\\Tools\\browser_exce\\edgedriver_win64.exe");
		EdgeDriver driver = new EdgeDriver();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// driver.close(); will close the current session but wont delete
		// edge driver.exce from stack
		driver.quit();

	}

}
