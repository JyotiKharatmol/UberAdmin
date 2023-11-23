package pageObjects;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class CreateANewSoloInstructor extends AbstractComponent
{
	WebDriver driver;
	
  public CreateANewSoloInstructor(WebDriver driver)
  {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
  }
	
  	@FindBy(css="div h2[class*='alignCenter']")
  WebElement createANewSoloInstructor_title;
  
  	public WebElement createANewSoloInstructor_title()
  	{
  		waitForVisibilityOfElement(createANewSoloInstructor_title);
  		return createANewSoloInstructor_title;
  	}
  	
  	@FindBy(css="div[class*='rounded'] div")
  	WebElement createANewSoloInstructor_elements;
  
	@FindBy(css="input[name='name']")
	WebElement brandName;
	
	public WebElement brandName()
	{
		waitForVisibilityOfAllElements(createANewSoloInstructor_elements);
		waitForElementToBeClickable(brandName);
		brandName.sendKeys("Cross-Fit");
		return brandName;
	}
	
	@FindBy(css="div[id*='timeZone']")
	WebElement selectTimeZone;
	
	public WebElement selectTimeZone()
	{
		waitForElementToBeClickable(selectTimeZone);
		selectTimeZone.click();
		return selectTimeZone;	
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[1]")
	WebElement selectTimeZoneCentral;
	
	public WebElement selectTimeZoneCentral()
	{
		waitForVisibilityOfElement(selectTimeZoneCentral);
		return selectTimeZoneCentral;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[2]")
	WebElement selectTimeZoneEastern;
	
	public WebElement selectTimeZoneEastern()
	{
		waitForVisibilityOfElement(selectTimeZoneEastern);
		selectTimeZoneEastern.click();
		return selectTimeZoneEastern;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[3]")
	WebElement selectTimeZoneMountain;
	
	public WebElement selectTimeZoneMountain()
	{
		return selectTimeZoneMountain;
	}
	
	@FindBy(xpath="//ul[@role='listbox']/li[4]")
	WebElement selectTimeZonePacific;
	
	public WebElement selectTimeZonePacific()
	{
		return selectTimeZonePacific;
	}
	
	@FindBy(css="input[name='address1']")
	WebElement address1;
	
	public WebElement address1()
	{
		address1.sendKeys("Highland Street 120");
		return address1;
	}
	
	@FindBy(css="input[name='address2']")
	WebElement address2;
	
	public WebElement address2()
	{
		return address2;
	}
	
	@FindBy(css="input[name='city']")
	WebElement city;
	
	public WebElement city()
	{
		city.sendKeys("Atlanta");
		return city;
	}
	
	@FindBy(css="div[id*='state']")
	WebElement selectState;
	
	public WebElement selectState()
	{
		waitForElementToBeClickable(selectState);
		selectState.click();
		return selectState;
	}
	
	@FindBy(css="ul li:nth-child(3)")
	WebElement selectStateArizona;
	
	public WebElement selectStateArizona()
	{
		waitForVisibilityOfElement(selectStateArizona);
		selectStateArizona.click();
		return selectStateArizona;
	}
	
	@FindBy(xpath="//div/div[7]/div[@inputmode='numeric']/div/input")
	WebElement zip;
	
	public WebElement zip()
	{
		waitForElementToBeClickable(zip);
		zip.sendKeys("30300");
		return zip;
	}
	
	@FindBy(css="input[name='firstName']")
	WebElement firstName;
	
	public WebElement firstName()
	{
		waitForElementToBeClickable(firstName);
		firstName.sendKeys("Jyoti");
		return firstName;
	}
	
	@FindBy(css="input[name='lastName']")
	WebElement lastName;
	
	public WebElement lastName()
	{
		waitForElementToBeClickable(lastName);
		lastName.sendKeys("Kharatmol");
		return lastName;
	}
	
	@FindBy(xpath="//div/div[10]/div[@inputmode='numeric']/div/input")
	WebElement phoneNumber;
	
	public WebElement phoneNumber()
	{
		waitForElementToBeClickable(phoneNumber);
		phoneNumber.sendKeys("4565676678");
		return phoneNumber;
	}
	
	@FindBy(css="input[name='emailId']")
	WebElement soloInstructorEmail;
	
	public WebElement soloInstructorEmail()
	{
		waitForElementToBeClickable(soloInstructorEmail);
		soloInstructorEmail.sendKeys("jyoti.kharatmol+solo@azularc.com");
		return soloInstructorEmail;
	}
	
	@FindBy(css="input[name='alias']")
	WebElement companyAlias;
	
	public String companyAlias()
	{
		waitForElementToBeClickable(companyAlias);
		String random = RandomStringUtils.randomAlphanumeric(4);
		companyAlias.sendKeys("alias"+random);
		return random;
	}
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-12 MuiGrid-grid-md-6 MuiGrid-grid-lg-4']/div[@inputmode='numeric']/div/input[@type='text']")
	WebElement merchantId;
	
	public WebElement merchantId()
	{
		waitForElementToBeClickable(merchantId);
		merchantId.sendKeys("516158991");
		return merchantId;
	}
	
	@FindBy(css="input[name='merchantUsername']")
	WebElement merchantUsername;
	
	public WebElement merchantUsername()
	{
		waitForElementToBeClickable(merchantUsername);
		merchantUsername.sendKeys("SmartStudioDev");
		return merchantUsername;
	}
	
	@FindBy(css="input[name='merchantPassword']")
	WebElement merchantPassword;
	
	public WebElement merchantPassword()
	{
		waitForElementToBeClickable(merchantPassword);
		merchantPassword.sendKeys("SmartDev!-00");
		return merchantPassword;
	}
	
	@FindBy(xpath="//span[text()='SAVE & SEND INVITE']")
	WebElement saveAndSendInvite;
	
	public WebElement saveAndSendInvite()
	{
		waitForElementToBeClickable(saveAndSendInvite);
		saveAndSendInvite.click();
		return saveAndSendInvite;
	}
	
}
