package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uber_InstructorList extends Abstract_Component 
{

	WebDriver driver;
	
	public Uber_InstructorList(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@role='tablist']/button[1]/span[1]")
	WebElement companyTab;
	
	@FindBy(xpath="//div[@role='tablist']/button[2]/span[1]")
	WebElement soloInstructorTab;
	
	@FindBy(css="p button[type='button']")
	WebElement addCompanyButton;
	
	@FindBy(css="p button")
	WebElement addSoloButton;
	
	@FindBy(xpath="//div[@role='grid']/div[1]/div[1]")
	WebElement companyNameColumnHeader;
	
	@FindBy(xpath="//div[@role='grid']/div[1]/div[2]")
	WebElement companyAliasColumnHeader;
	
	@FindBy(xpath="//div[@role='grid']/div[2]")
	WebElement companyDataTable;
	
	@FindBy(xpath="//div[@role='columnheader'][1]")
	WebElement soloNameColumnHeader;
	
	@FindBy(xpath="//div[@role='columnheader'][2]")
	WebElement soloAliasColumnHeader;
	
	@FindBy(xpath="//div[@role='grid']/div[@role='rowgroup']")
	WebElement soloDataTable;
	
	@FindBy(xpath="//*[text()='LOG OUT']")
	WebElement logoutButton;
	
	@FindBy(css="div[role='columnheader']:nth-child(1) span")
	WebElement soloInstructorName;
	
	@FindBy(css="div[role='columnheader']:nth-child(2) span")
	WebElement soloInstrucorAlias;
	
	@FindBy(xpath="//div[@role='rowgroup']/div")
	WebElement soloInstructorTable;
	
	public WebElement SoloInstructorName()
	{
		return soloInstructorName;
	}
	public WebElement SoloInstructorList()
	{
		return soloInstrucorAlias;
	}
	public WebElement SoloInstructorTable()
	{
		return soloInstructorTable;
	}
	public WebElement CompanyTab()
	{
		return companyTab;
	}
	public WebElement SoloInstructorTab()
	{
		waitForElementToAppear(soloInstructorTab);
		return soloInstructorTab;
	}
	public WebElement AddCompanyButton()
	{
		return addCompanyButton;
	}
	public Create_SoloInstructor AddSoloButton()
	{
		addSoloButton.click();
		return new Create_SoloInstructor(driver);	
	}
	public WebElement CompanyNameColumnHeader()
	{
		return companyNameColumnHeader;
	}
	public WebElement CompanyAliasColumnHeader()
	{
		return companyAliasColumnHeader;
	}
	public WebElement CompanyDataTable()
	{
		return companyDataTable;
	}
	public WebElement SoloNameColumnHeader()
	{
		return soloNameColumnHeader;
	}
	public WebElement soloAliasColumnHeader()
	{
		return soloAliasColumnHeader;
	}
	public WebElement SoloDataTable()
	{
		return soloDataTable;
	}
	public WebElement LogoutButton()
	{
		waitForElementToAppear(logoutButton);
		return logoutButton;
	}

}
