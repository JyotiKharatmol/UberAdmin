package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import abstractComponents.AbstractComponent;

public class SoloInstructorTab extends AbstractComponent 
{
	WebDriver driver;
	
	public SoloInstructorTab(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@role='tablist']/button[1]/span[1]")
	WebElement companyTab;
	
	public WebElement companyTab()
	{
		return companyTab;
	}
	
	@FindBy(css="p button[type='button']")
	WebElement addCompanyButton;
	
	public WebElement addCompanyButton()
	{
		return addCompanyButton;
	}
	
	@FindBy(xpath="//div[@role='grid']/div[1]/div[1]")
	WebElement companyNameColumnHeader;
	
	public WebElement companyNameColumnHeader()
	{
		return companyNameColumnHeader;
	}
	
	@FindBy(xpath="//div[@role='grid']/div[1]/div[2]")
	WebElement companyAliasColumnHeader;
	
	public WebElement companyAliasColumnHeader()
	{
		return companyAliasColumnHeader;
	}
	
	@FindBy(xpath="//div[@role='grid']/div[2]")
	WebElement companyDataTable;
	
	public WebElement companyDataTable()
	{
		return companyDataTable;
	}
		
	@FindBy(xpath="//div[@role='tablist']/button[2]/span[1]")
	WebElement soloTab;
	
	public WebElement soloTab()
	{
		waitForVisibilityOfElement(soloTab);
		waitForElementToBeClickable(soloTab);
		return soloTab;
	}
	
	@FindBy(xpath="//span[text()='+ Add Solo Instructor']")
	WebElement addSoloInstructor;
	
	public CreateANewSoloInstructor addSoloInstructor()
	{
		waitForVisibilityOfElement(addSoloInstructor);
		waitForElementToBeClickable(addSoloInstructor);
		addSoloInstructor.click();
		return new CreateANewSoloInstructor(driver);	
	}
	
	@FindBy(xpath="//div[contains(@class,'headerRow')]/div[1]/div/span")
	WebElement soloInstructorName_columnHeading;
	
	public WebElement soloInstructorName_columnHeading()
	{
		waitForVisibilityOfElement(soloInstructorName_columnHeading);
		return soloInstructorName_columnHeading;
	}
	
	@FindBy(xpath="//div[contains(@class,'headerRow')]/div[2]/div/span")
	WebElement soloInstructorAlias_columnHeading;
	
	public WebElement soloInstructorAlias_columnHeading()
	{
		waitForVisibilityOfElement(soloInstructorAlias_columnHeading);
		return soloInstructorAlias_columnHeading;
	}
	
	@FindBy(xpath="//div[@role='grid']/div[@role='rowgroup']")
	WebElement soloDataTable;
	
	public WebElement soloDataTable()
	{
		return soloDataTable;
	}
	
	@FindBy(css="div[role='columnheader']:nth-child(1) span")
	WebElement soloInstructorName;
	
	public WebElement SoloInstructorName()
	{
		return soloInstructorName;
	}
	
	@FindBy(css="div[role='columnheader']:nth-child(2) span")
	WebElement soloInstrucorAlias;
	
	public WebElement SoloInstructorList()
	{
		return soloInstrucorAlias;
	}
	
	@FindBy(xpath="//div[@aria-rowindex='1']/div[1]/div")
	WebElement createdSoloInstructorName;
	
	public WebElement createdSoloInstructorName()
	{
		waitForVisibilityOfElement(createdSoloInstructorName);
		return createdSoloInstructorName;
	}
	
	@FindBy(xpath="//div[@aria-rowindex='1']/div[2]/div")
	WebElement createdSoloInstructorAlias;
	
	public WebElement createdSoloInstructorAlias()
	{
		waitForVisibilityOfElement(createdSoloInstructorAlias);
		return createdSoloInstructorAlias;
	}
	
	@FindBy(xpath="//div[@role='rowgroup']/div")
	WebElement soloInstructorTable;
	
	public WebElement SoloInstructorTable()
	{
		return soloInstructorTable;
	}
	
	@FindBy(css="div[class*='MuiAlert-message']")
	WebElement emailSentToSoloInstructorAlertMessage;
	
	public WebElement emailSentToSoloInstructorAlertMessage()
	{
		waitForVisibilityOfElement(emailSentToSoloInstructorAlertMessage);
		return emailSentToSoloInstructorAlertMessage;
	}
	
	@FindBy(xpath="//span[text()='LOG OUT']")
	WebElement logout;

	public WebElement logout()
	{
		waitForVisibilityOfElement(logout);
		return logout;
	}

}
