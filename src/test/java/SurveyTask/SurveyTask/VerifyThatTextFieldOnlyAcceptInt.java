package SurveyTask.SurveyTask;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class VerifyThatTextFieldOnlyAcceptInt extends TestBase{
	
	 SurveryPOM surveyPOM;
  @Test
  public void verifyingEnteringChrs() {
	  
	  surveyPOM.startSurvey();
	  surveyPOM.answeringQuestionOne("Red");
	  surveyPOM.clickNextbtn();
	  surveyPOM.answeringQuestionTwo("Do i accept String?");
	  surveyPOM.clickNextbtn();
	  surveyPOM.verifyWarningMsgAppearance();
  }
  @BeforeTest
  public void beforeTest() {
	  surveyPOM = new SurveryPOM(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
