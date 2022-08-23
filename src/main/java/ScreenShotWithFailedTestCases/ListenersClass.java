package ScreenShotWithFailedTestCases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass extends BaseClass implements ITestListener{

	public void onTestFailure(ITestResult result) {
		//System.out.println(result.getTestContext().getName()+"_"+result.getMethod().getMethodName() );
		try {
			screencapture(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
