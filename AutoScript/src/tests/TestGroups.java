package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroups {
	
	@Test(groups = {"smkTest","FunTest"})
	public void TC_01()
	{
		Reporter.log("Smoke Testing and Functional Testing",true);
	}
	@Test(groups = "FunTest")
	public void TC_02()
	{
		Reporter.log("Functional Testing",true);
	}
	@Test(groups = {"IntTest","RegTest"})
	public void TC_03()
	{
		Reporter.log("Integration Testing and regression Testing",true);
	}
	@Test(groups = {"SysTest","RegTest"})
	public void TC_04()
	{
		Reporter.log("System Testing and regression Testing",true);
	}
	@Test(groups = "AdTest")
	public void TC_05()
	{
		Reporter.log("Adhoc Testing",true);
	}

}
