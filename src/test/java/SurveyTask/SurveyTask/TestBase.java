package SurveyTask.SurveyTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver;
	
	
	public TestBase() {
	
	
		//Add chrome driver exe file in the system properties
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new ChromeDriver();
		//Take new object from CHrome Driver
	
		// Open Google URL from WebDriver
		driver.navigate().to("https://survey.quantilope.com/SfidqfGjdrvMzwzWK/3gqu3kMSbapwXpXff/9xednGW4bJAGd7sv2");
	
		
	}

}
