package testComponents;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import resources.ExtentReporterNG;

public class Listeners extends BaseTest implements ITestListener
{

	ExtentReports extent = ExtentReporterNG.getObjectReport();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		test = extent.createTest(result.getMethod().getMethodName());	
	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
	
		test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		test.fail(result.getThrowable());
		
		try 
		{
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} 
		catch (Exception e) 
		{
		
			e.printStackTrace();
		} 
		
		String path = null;
		try 
		{
			path = getScreenshot(result.getMethod().getMethodName(),driver);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path, result.getMethod().getMethodName());
		
		}

	@Override
	public void onTestSkipped(ITestResult result) 
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
		 extent.flush();
	}
	
}
