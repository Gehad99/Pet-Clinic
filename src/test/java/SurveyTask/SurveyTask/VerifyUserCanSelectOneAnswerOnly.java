package SurveyTask.SurveyTask;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;

public class VerifyUserCanSelectOneAnswerOnly extends TestBase {
	
	 SurveryPOM surveyPOM;
  @Test
  public void selectingMultipleAnswers()  {
	  surveyPOM.startSurvey();
	  surveyPOM.answeringQuestionOne("Red");
	  surveyPOM.answeringQuestionOne("Blue");
	
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  surveyPOM = new SurveryPOM(driver);
  }

  @AfterTest
  public void afterTest() {
	driver.close();
  }

}
