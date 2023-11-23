package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import abstractComponents.AbstractComponent;

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
	WebElement enterUserName;
	
	public WebElement enterCorrectUserName()
	{
		waitForVisibilityOfElement(enterUserName);
		enterUserName.sendKeys("jyoti.kharatmol@azularc.com");
		return enterUserName;
	}
	
	public WebElement enterUserName()
	{
		waitForVisibilityOfElement(enterUserName);
		return enterUserName;
	}

	@FindBy(css="input[name='password']")
	WebElement enterPassword;
	
	public WebElement enterCorrectPassword()
	{
		waitForVisibilityOfElement(enterPassword);
		enterPassword.sendKeys("$m@rtDev!-00");
		return enterPassword;
	}
	
	public WebElement enterPassword()
	{
		waitForVisibilityOfElement(enterPassword);
		return enterPassword;
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
