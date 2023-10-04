package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends AbstractComponent 
{
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div h1")
	WebElement login_title;
	
	public WebElement login_title()
	{
		waitForVisibilityOfElement(login_title);
		return login_title;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement userName;
	
	public WebElement userName()
	{
		waitForVisibilityOfElement(userName);
		return userName;
	}
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	public WebElement password()
	{
		waitForVisibilityOfElement(password);
		return password;
	}
	
	@FindBy(linkText="Forgot password?")
	WebElement forgotPassword;
	
	public ResetPassword forgotPassword()
	{
		waitForVisibilityOfElement(forgotPassword);
		forgotPassword.click();
		return new ResetPassword(driver);
	}
	
	@FindBy(css="button[class*='disabled']")
	WebElement loginButtonIsDisabled;
	
	public WebElement loginButtonIsDisabled()
	{
		waitForVisibilityOfElement(loginButtonIsDisabled);
		return loginButtonIsDisabled;
	}
	
	@FindBy(xpath="//span[text()='LOGIN']")
	WebElement loginButton;
	
	public SoloInstructorTab loginButton()
	{
		waitForVisibilityOfElement(loginButton);
		waitForElementToBeClickable(loginButton);
		loginButton.click();
		return new SoloInstructorTab(driver);
	}
	
	@FindBy(xpath="//div[@role='alert']/div[2]")
	WebElement loginErrorMessage;

	public WebElement loginErrorMessage()
	{
		return loginErrorMessage;
	}
	
}
