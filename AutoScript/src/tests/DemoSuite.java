package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoSuite {
  @Test
  public void f() {
	  Reporter.log("from test method ",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("from before method ",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("from after method ",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("from before class ",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("from after class ",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("from before test ",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("from after test ",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("from before suite ",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("from after suite ",true);
  }

}
