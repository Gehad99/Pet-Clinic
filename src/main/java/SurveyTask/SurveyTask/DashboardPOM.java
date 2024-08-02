package SurveyTask.SurveyTask;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPOM extends ElementHelper {

	public DashboardPOM(WebDriver driver) {
		super(driver);
	}

	private int[] valuesBefore = new int[3];
	private int[] valuesAfter = new int[3];

	// Locators for total N values of the questions
	private By firstTotalN = By.xpath("(//*[@class='highcharts-credits' and @text-anchor='end'])[3]");
	private By secondTotalN = By.xpath("(//*[@class='highcharts-credits' and @text-anchor='end'])[2]");
	private By thirdTotalN = By.xpath("(//*[@class='highcharts-credits' and @text-anchor='end'])[1]");

	/**
	 * Get text from a web element and parse it to an integer.
	 *
	 * @param locator the locator for the web element
	 * @return the integer value extracted from the element's text
	 */
	private int getIntegerFromElement(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			return Integer.parseInt(element.getText().replaceAll("\\D+", ""));
		} catch (NumberFormatException e) {
			// Handle the case where the text cannot be parsed to an integer
			System.err.println("NumberFormatException for locator " + locator + ": " + e.getMessage());
			return 0;
		} catch (Exception e) {
			// Handle other possible exceptions
			System.err.println("Exception for locator " + locator + ": " + e.getMessage());
			return 0;
		}
	}

	/**
	 * Get values before an event or action.
	 */
	public void getTotalNBefore() {
		valuesBefore[0] = getIntegerFromElement(firstTotalN);
		valuesBefore[1] = getIntegerFromElement(secondTotalN);
		valuesBefore[2] = getIntegerFromElement(thirdTotalN);
	}

	/**
	 * Get values after an event or action.
	 */
	public void getTotalNAfter() {
		valuesAfter[0] = getIntegerFromElement(firstTotalN);
		valuesAfter[1] = getIntegerFromElement(secondTotalN);
		valuesAfter[2] = getIntegerFromElement(thirdTotalN);
	}

	/**
	 * Navigate to the specified dashboard URL.
	 */
	public void navigateToDashboard() {
		driver.navigate().to("https://app.quantilope.com/share/WJvveDz5BDzwSDYBX?type=dashboard");
	}

	/**
	 * Assert that the values before are incremented by 1 compared to the values after.
	 */
	public void assertValuesBeforeAfter() {
		for (int i = 0; i < valuesBefore.length; i++) {
			assertEquals(valuesBefore[i] + 1, valuesAfter[i], "The value for index " + i + " did not increment correctly.");
		}
	}
}
