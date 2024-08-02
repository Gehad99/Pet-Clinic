package SurveyTask.SurveyTask;


import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class E2E_Test extends TestBase {
	
	
	 SurveryPOM surveyPOM;
	 DashboardPOM dashBoardPOM;
			  
	@BeforeTest	
	public void beforeTest() {
	3
		surveyPOM = new SurveryPOM(driver);
		dashBoardPOM = new DashboardPOM(driver);
		
		 
	  }
	@Test
  public void submitSurveyTest() {
	  
	
	  dashBoardPOM.navigateToDashboard();
	  dashBoardPOM.getTotalNBefore();
	  
	  surveyPOM.navigateToSurvey();
	  surveyPOM.startSurvey();
	  surveyPOM.answeringQuestionOne("Red");
	  surveyPOM.clickNextbtn();
	  surveyPOM.answeringQuestionTwo("33");
	  surveyPOM.clickNextbtn();
	  surveyPOM.answeringQuestionThree("2");
	  surveyPOM.clickNextbtn();
	  dashBoardPOM.navigateToDashboard();
	  dashBoardPOM.getTotalNAfter(); 
	  dashBoardPOM.assertValuesBeforeAfter();

  }
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	 
  }
}
