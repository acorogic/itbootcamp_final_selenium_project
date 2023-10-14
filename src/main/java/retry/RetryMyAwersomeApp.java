package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryMyAwersomeApp implements IRetryAnalyzer {

    int count=0;
    int maxRetry=3;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<maxRetry) {
            count++;
            return true;
        }
        return false;
    }}