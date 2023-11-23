package tests;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pageObjects.CreateANewSoloInstructor;
import pageObjects.LoginPage;
import pageObjects.ResetPassword;
import pageObjects.SoloInstructorTab;
import testComponents.BaseTest;
import abstractComponents.AbstractComponent;

public class UberAdmin extends BaseTest

{	
	@BeforeMethod
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
	}
	
	@Test(priority=1)
	public void LoginWithValidCredentials() throws IOException
	{	
		LoginPage l = new LoginPage(driver);
		Assert.assertEquals(l.login_title().getText(), "Login to your account");
		Assert.assertTrue(l.loginButtonIsDisabled().isDisplayed());
		l.userName().sendKeys("jyoti.kharatmol@azularc.com");
		l.password().sendKeys("$m@rtDev!-00");
		SoloInstructorTab s = l.loginButton();	
		AbstractComponent a = new AbstractComponent(driver);
		s.logout().click();
		a.waitForURLToContain("app");

	}
	
	@Test(priority=2)
	public void ForgotPassword() throws IOException
	{
		LoginPage l = new LoginPage(driver);
		ResetPassword r = l.forgotPassword();
		AbstractComponent a = new AbstractComponent(driver);
		a.waitForURLToContain("forgotPassword");
		r.resetPasswordEmail().sendKeys("jyoti.kharatmol@azularc.com");
		r.sendMeResetPasswordLink();
		Assert.assertEquals(r.resetPasswordAlert().getText(), "An email has been sent to you with a reset password link.");
		a.waitForURLToContain("login");
	}
	
	@Test(dataProvider="getValue")
	public void LoginWithInvalidCredentials(String EmailId, String Password) throws IOException
	{	
		driver.get(pro.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		l.userName().sendKeys(EmailId);
		l.password().sendKeys(Password);
		l.loginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/login");
	}
	
	@DataProvider
	public Object[][] getValue()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "jyotikharatmol@azularc.com";
		data[0][1]= "$m@rtDev!-00";
	
		data[1][0] = "jyoti.kharatmol@azularc.com";
		data[1][1]= "$m@rtDev!-0";
		
		data[2][0] = "jyotikharatmol@azularc.com";
		data[2][1]= "$m@rtDev!-";
		
	  return data;
	}
		
	@Test(priority=4)
	public void CreateNewSoloInstructor()
	{
		LoginPage l = new LoginPage(driver);
		l.userName().sendKeys("jyoti.kharatmol@azularc.com");
		l.password().sendKeys("$m@rtDev!-00");
		SoloInstructorTab s = l.loginButton();
		AbstractComponent a = new AbstractComponent(driver);
		a.waitForURLToContain("app");
		s.soloTab().click();
		CreateANewSoloInstructor c = s.addSoloInstructor();
		Assert.assertEquals(c.createANewSoloInstructor_title().getText(), "Create a New Solo Instructor");
		c.brandName().sendKeys("Cross-Fit");
		c.selectTimeZone().click();
		c.selectTimeZoneEastern().click();
		c.address1().sendKeys("Highland Street 120");
		c.city().sendKeys("Atlanta");
		c.selectState().click();
		c.selectStateArizona().click();
		c.zip().sendKeys("30300");
		c.firstName().sendKeys("Jyoti");
		c.lastName().sendKeys("Kharatmol");
		c.phoneNumber().sendKeys("4565676678");
		c.soloInstructorEmail().sendKeys("jyoti.kharatmol@azularc.com");
		String random = c.companyAlias();
		c.merchantId().sendKeys("516158991");
		c.merchantUsername().sendKeys("SmartStudioDev");
		c.merchantPassword().sendKeys("SmartDev!-00");
		c.saveAndSendInvite().click();	
		Assert.assertEquals(s.emailSentToSoloInstructorAlertMessage().getText(), "Thank you for adding a solo instructor! A link has been sent to the Email ID entered.");
		Assert.assertEquals(s.soloInstructorName_columnHeading().getText(), "Solo Instructor Name");
		Assert.assertEquals(s.soloInstructorAlias_columnHeading().getText(), "Solo Instructor Alias");
		Assert.assertEquals(s.createdSoloInstructorName().getText(), "Jyoti Kharatmol");
		a.waitForTextInElementToBe(s.createdSoloInstructorAlias(), random);
		Assert.assertEquals(s.createdSoloInstructorAlias().getText(), "alias"+random);
		s.logout().click();
		a.waitForURLToContain("login");
	}
	
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
		
}