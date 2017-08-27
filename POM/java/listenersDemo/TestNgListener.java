package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("TC onTestStart and Details are :" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TC onTestSuccess and Details are :" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TC onTestFailure and Details are :" + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TC onTestSkipped and Details are :" + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
