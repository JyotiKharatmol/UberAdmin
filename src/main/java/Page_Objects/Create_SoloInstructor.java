package Page_Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_SoloInstructor extends Abstract_Component
{
	WebDriver driver;
	
  public Create_SoloInstructor(WebDriver driver)
  {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
  }
	
	@FindBy(css="input[name='name']")
	WebElement brandName;
	
	public WebElement BrandName()
	{
		return brandName;
	}
	
	@FindBy(css="div[id*='timeZone']")
	WebElement timeZone;
	
	public WebElement TimeZone()
	{
		waitForElementToAppear(timeZone);
		return timeZone;	
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[1]")
	WebElement timeZone_eastern;
	
	public WebElement TimeZone_eastern()
	{
		return timeZone_eastern;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[2]")
	WebElement timeZone_central;
	
	public WebElement TimeZone_central()
	{
		return timeZone_central;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[3]")
	WebElement timeZone_mountain;
	
	public WebElement TimeZone_mountain()
	{
		return timeZone_mountain;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[4]")
	WebElement timeZone_pacific;
	
	public WebElement TimeZone_pacific()
	{
		return timeZone_pacific;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement address1;
	
	public WebElement Address1()
	{
		return address1;
	}
	
	@FindBy(css="input[name='address2']")
	WebElement address2;
	
	public WebElement Address2()
	{
		return address2;
	}
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	public WebElement City()
	{
		return city;
	}
	
	@FindBy(css="div[id*='state']")
	WebElement state;
	
	public WebElement State()
	{
		return state;
	}
	
	@FindBy(css="ul li:nth-child(3)")
	WebElement stateArizona;
	
	public WebElement stateoption()
	{
		return stateArizona;
	}
	
	@FindBy(xpath="//div/ul/li")
	WebElement stateDropdownList;
	
	public WebElement StateDropdownList()
	{
		return stateDropdownList;
	}
	
	@FindBy(css="input[name='zip']")
	WebElement zip;
	
	public WebElement Zip()
	{
		return zip;
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement firstName;
	
	public WebElement FirstName()
	{
		return firstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement lastName;
	
	public WebElement LastName()
	{
		return lastName;
	}
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4']/div[@inputmode='numeric']/div/input")
	WebElement phoneNumber;
	
	public WebElement PhoneNumber()
	{
		return phoneNumber;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement soloInstrcutorEmailID;
	
	public WebElement SoloInstrcutorEmailID()
	{
		return soloInstrcutorEmailID;
	}
	
	@FindBy(css="input[name='alias']")
	WebElement companyAlias;
	
	public WebElement CompanyAlias()
	{
		return companyAlias;
	}
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-4']/div[@inputmode='numeric']/div/input[@type='text']")
	WebElement merchantId;
	
	public WebElement MerchantId()
	{
		return merchantId;
	}
	
	@FindBy(css="input[name='merchantUsername']")
	WebElement merchantUsername;
	
	public WebElement MerchantUsername()
	{
		return merchantUsername;
	}
	
	@FindBy(css="input[name='merchantPassword']")
	WebElement merchantPassword;
	
	public WebElement MerchantPassword()
	{
		return merchantPassword;
	}
	
	@FindBy(xpath="//div//div/div/button[@type='submit']")
	WebElement saveAndSendInvite;
	
	public WebElement SaveAndSendInvite()
	{
		return saveAndSendInvite;
	}
	
}
