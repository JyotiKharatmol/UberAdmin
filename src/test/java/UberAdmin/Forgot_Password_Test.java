package UberAdmin;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Page_Objects.Uber_Login;
import Page_Objects.Uber_ResetPassword;
import Resource_Properties.Base_File;

public class Forgot_Password_Test extends Base_File {
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
	}

	
	@Test
	public void ForgotPassword() throws IOException
	{
		Uber_Login l = new Uber_Login(driver);
		l.ForgotPassword().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://smartstudio-stage.azul-arc.com/#/forgotPassword");
		Uber_ResetPassword r = new Uber_ResetPassword(driver);
		r.EmailIdOfResetPassword().sendKeys("jyoti.kharatmol@azularc.com");
		r.sendMeResetPasswordLinkButton().click();
		
		Assert.assertEquals(r.ResetPasswordAlert().getText(), "An email has been sent to you with a reset password link.");
	}
	
		
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

	
}
