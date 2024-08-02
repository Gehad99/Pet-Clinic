package SurveyTask.SurveyTask;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class VerifyWarningMsgAppearance  {
	
	SurveryPOM surveyPOM;
	TestBase testBase;

  @BeforeMethod
	  public void beforeTest() {
	  
	  	testBase = new TestBase();
		  surveyPOM = new SurveryPOM(testBase.driver);
		 
		  
	  }
  
  
  @Test
  public void q1_ErrorMsgVerification() {
	  
	  surveyPOM.startSurvey();
	  surveyPOM.clickNextbtn();
	  surveyPOM.verifyWarningMsgAppearance();
	 
	  
  }
  
  @Test
  public void q2_ErrorMsgVerification() {
	  
	  surveyPOM.startSurvey();
	  surveyPOM.answeringQuestionOne("Red");
	  surveyPOM.clickNextbtn();
	  surveyPOM.clickNextbtn();
	  surveyPOM.verifyWarningMsgAppearance();
	 
	  
  }
  
  @Test
  public void q3_ErrorMsgVerification() {
	  
	  surveyPOM.startSurvey();
	  surveyPOM.answeringQuestionOne("Red");
	  surveyPOM.clickNextbtn();
	  surveyPOM.answeringQuestionTwo("33");
	  surveyPOM.clickNextbtn();
	  surveyPOM.clickNextbtn();
	  surveyPOM.verifyWarningMsgAppearance();
	 
	  
  }


  @AfterMethod
  public void afterTest() {
	  
	  testBase.driver.close();
  }

}
