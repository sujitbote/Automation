package RetryLogs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogsDemo implements IRetryAnalyzer
{
	int retrytimes = 2;
	int count = 0;
	
	public boolean retry(ITestResult result)
	{
		
		if(count<retrytimes)
		{
			count ++;
			return true; //retry the TC by 2 times
		}
		
		return false; //don't retry TC
	}
	
	
	
	

}
