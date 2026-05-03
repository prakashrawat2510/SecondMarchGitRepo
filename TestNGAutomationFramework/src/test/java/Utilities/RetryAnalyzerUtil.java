package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerUtil implements IRetryAnalyzer {

private int count =0;

private static final int maxtry=3;

	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			
			if(count<maxtry) {
				count++;
				return true;
			}
		}
		
		
		return false;
	}
	
	

}
