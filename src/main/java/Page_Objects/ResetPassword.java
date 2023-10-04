package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassword extends AbstractComponent
{
	WebDriver driver;
	
	public ResetPassword(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement resetPasswordEmail;
	
	public WebElement resetPasswordEmail()
	{
		return resetPasswordEmail;
	}
	
	@FindBy(css="div.jss11 button")
	WebElement sendMeResetPasswordLink;
	
	public LoginPage sendMeResetPasswordLink()
	{
		sendMeResetPasswordLink.click();
		return new LoginPage(driver);
	}
	
	@FindBy(css="a[href*='login'] div")
	WebElement backToLoginButton;
	
	public WebElement backToLoginButton()
	{
		return backToLoginButton;
	}
	
	@FindBy(css="div.MuiAlert-message")
	WebElement resetPasswordAlert;
	
	public WebElement resetPasswordAlert()
	{
		waitForVisibilityOfElement(resetPasswordAlert);
		return resetPasswordAlert;
	}

}
