package abstractComponents;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent 
{
	WebDriver driver;
	
	public  AbstractComponent(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void waitForURLToContain(String a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.urlContains(a));
	}
	
	public void waitForVisibilityOfElement(WebElement a )
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(100));
		w.until(ExpectedConditions.visibilityOf(a));
	}
	
	public void waitForVisibilityOfAllElements(WebElement a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.visibilityOfAllElements(a));
	}
	
	public void waitForElementToBeClickable(WebElement a)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.elementToBeClickable(a));
	}
	
	public void waitForTextInElementToBe(WebElement a, String b)
	{
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		w.until(ExpectedConditions.textToBePresentInElement(a, b));
		
	}
	

}
