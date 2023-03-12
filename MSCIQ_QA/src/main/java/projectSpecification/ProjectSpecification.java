package projectSpecification;

import org.testng.annotations.*;

import base.Base;

public class ProjectSpecification extends Base {
	@BeforeTest
	public void beforeTest()
	{
		startApp();
	}
	
	@AfterTest
	public void afterTest()
	{
		quitApp();
	}

}
