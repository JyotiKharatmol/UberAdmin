package Page_Objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract_Component {

	WebDriver driver;
	
	public  Abstract_Component(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void waitForElementToAppear(WebElement a )
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(a));
	
	}

}
