package SurveyTask.SurveyTask;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

public class ElementHelper {

	WebElement element;
	WebDriver driver;
	WebDriverWait wait;

	public ElementHelper(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
	}

	public void clickElement(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		element = driver.findElement(by);
		element.click();
	}

	public void sendKeysElement(By by, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
		element = driver.findElement(by);
		element.sendKeys(value);
	}

	public void assertion(By by, String expected) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		element = driver.findElement(by);
		assertEquals(element.getText(), expected);
	}

	public void waitForElementToBeVisible(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public String getText(By by) {
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return element.getText();
	}
}
