package UberAdmin;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Page_Objects.Create_SoloInstructor;
import Page_Objects.Uber_InstructorList;
import Page_Objects.Uber_Login;
import Resource_Properties.Base_File;

public class Create_Solo_Instructor_Test extends Base_File{

	@BeforeTest
	public void initialize() throws IOException
	
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		Uber_Login u = new Uber_Login(driver);
		u.EmailID().sendKeys("jyoti.kharatmol@azularc.com");
		u.Password().sendKeys("Password@3");
		u.LoginButton();
	}
	
	@Test
	public void CreateNewSoloInst()
	{
		Uber_InstructorList s = new Uber_InstructorList(driver);
		s.SoloInstructorTab().click();
		Create_SoloInstructor so= s.AddSoloButton();
		so.BrandName().sendKeys("Cross-Fit");
		so.TimeZone().click();
		so.TimeZone_central().click();
		so.Address1().sendKeys("Highland Street 120");
		so.City().sendKeys("Atlanta");
		so.State().click();
		so.stateoption().click();
		so.Zip().sendKeys("30300");
		so.FirstName().sendKeys("Jyoti");
		so.LastName().sendKeys("Kharatmol");
		so.PhoneNumber().sendKeys("4565676678");
		so.SoloInstrcutorEmailID().sendKeys("jyoti.kharatmol@azularc.com");
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		so.CompanyAlias().sendKeys("alias"+randomInt);
		so.MerchantId().sendKeys("516158991");
		so.MerchantUsername().sendKeys("SmartStudioDev");
		so.MerchantPassword().sendKeys("SmartDev!-00");
		so.SaveAndSendInvite().click();	
	}
	
	@AfterTest
	public void teardown()
	{
	driver.close();
	}
	
	
	
	
}
