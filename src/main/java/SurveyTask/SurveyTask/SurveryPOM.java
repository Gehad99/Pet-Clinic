package SurveyTask.SurveyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class SurveryPOM extends ElementHelper{
	
	
	
	public SurveryPOM(WebDriver driver) {
		super(driver);
		
	}

		//Common Elements
		// "Next Page" button
		private By NxtBtn = By.id("nextPage");	
		private By WarningMessage = By.xpath("//label[@class='qlp-survey-question-container-error-message-text']");
		
		// Start Surevey button on the first page
		private By StartSurveyBtnPath = By.id("startSurvey");
	
		//First question_ First Answer (Yellow)
		private By FirstAnswerYellow = By.xpath("(//div[@class='qRadio'])[1]");

		//First question_ Second Answer (Red)
		private By SecondAnswerRed = By.xpath("(//div[@class='qRadio'])[2]");
	
		//First question_ Third Answer (Blue)
		private By ThirdAnswerBlue = By.xpath("(//div[@class='qRadio'])[3]");
	
	
//=====================================================================
	
		//Second question text field
		private By TxtField = By.id("LvyteD2QefqWgGNmF");
	
	
//=====================================================================
	
		//Third question_First answer (1=cheese stinks)
		private By FirstAnswerCheese1 = By.xpath("(//div[@class='qRadio'])[1]");
	
	    //Third question_Second answer (2)
		private By SecondAnswerCheese2 = By.xpath("(//div[@class='qRadio'])[2]");
		
		//Third question_Third answer (3)
		private By ThirdAnswerCheese3 = By.xpath("(//div[@class='qRadio'])[3]");
		
		//Third question_Fourth answer (4)
		private By FourthAnswerCheese4 = By.xpath("(//div[@class='qRadio'])[4]");
		
		//Third question_Second answer (5= i love cheese)
		private By FifthAnswerCheese5 = By.xpath("(//div[@class='qRadio'])[5]");
	
		
//=====================================================================
	
		//Star survey Method
		public void startSurvey() {
		
		
		clickElement(StartSurveyBtnPath);
		
		}
	
	
		//Answering the first question Method
		public void answeringQuestionOne (String answer) {
		
		if(answer == "Yellow") {
			clickElement(FirstAnswerYellow);
		}
		else if(answer == "Red") {
			clickElement(SecondAnswerRed);
		}
		else if(answer == "Blue") {
			clickElement(ThirdAnswerBlue);
		}
		}
	
		// Clicking the next button for all pages Method
		public void clickNextbtn() {
		clickElement(NxtBtn);
		}
		
		
		//Answering the second question Method
		public void answeringQuestionTwo(String answer) {
			
		sendKeysElement(TxtField,answer);
		
		}
	
		//Answering the third question Method
		public void answeringQuestionThree(String answer) {
		
		if(answer == "1") {
			clickElement(FirstAnswerCheese1);
		}
		else if(answer == "2") {
			clickElement(SecondAnswerCheese2);
		}
		else if(answer == "3") {
			clickElement(ThirdAnswerCheese3);
		}
		else if(answer == "4") {
			clickElement(FourthAnswerCheese4);
		}
		else if(answer == "5") {
			clickElement(FifthAnswerCheese5);
		}
		}
	
	public void verifyWarningMsgAppearance() {
		
		waitForElementToBeVisible(WarningMessage);
		
	}
	
	public void navigateToSurvey() {
		
		driver.navigate().to("https://survey.quantilope.com/SfidqfGjdrvMzwzWK/3gqu3kMSbapwXpXff/9xednGW4bJAGd7sv2");
	}
	
	
}


