package PocetakGit;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.BeforeClass;

public class LoginTest {

	@BeforeClass
	public void beforClass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		this.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}
}