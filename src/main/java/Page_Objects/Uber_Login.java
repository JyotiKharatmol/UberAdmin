package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uber_Login extends Abstract_Component {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public Uber_Login(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="input[name='emailId']")
	WebElement emailID;
	
	@FindBy(css="input[name='password']")
	WebElement password;
	
	@FindBy(css="a[href*='forgotPassword']")
	WebElement forgotPassword;
	
	@FindBy(css="div[class='jss11'] button")
	WebElement loginbutton;
	
	
	@FindBy(xpath="//div[@role='alert']/div[2]")
	WebElement loginErrorMessage;
	
	
	public WebElement EmailID()
	{
		return emailID;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement ForgotPassword()
	{
		return forgotPassword;
	}
	public Uber_InstructorList LoginButton()
	{
		loginbutton.click();
		return new Uber_InstructorList(driver);
	}
	public WebElement LoginErrorMessage()
	{
		return loginErrorMessage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
