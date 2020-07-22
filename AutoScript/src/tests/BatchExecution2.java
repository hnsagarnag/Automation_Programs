package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BatchExecution2 {
  @Test
  public void method3() {
	  Reporter.log("method3",true);
  }
  
  @Test
  public void method4() {
	  Reporter.log("method4",true);
  }
  
}
