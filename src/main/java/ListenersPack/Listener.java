package ListenersPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	// Right click on click Listener
	// click on source
	//click on override implemented methods
	//select all the listerners

	public void onFinish(ITestContext result) {
		System.out.println("On Finish method");
		
	}

	public void onStart(ITestContext result) {
		System.out.println("On start method Executed by prameela");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("OnTest failure method");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTest skipped  method");
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("OnTest start method");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test success method");
		
	}

}
