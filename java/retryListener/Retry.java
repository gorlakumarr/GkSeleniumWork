/**
 * 
 */
/**
 * @author USER
 *
 */
package retryListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int retrycount = 0;
	private int maxcount = 4;

	public boolean retry(ITestResult result) {
		if (retrycount < maxcount) {
			int status = result.getStatus();
			System.out.println("Retrying test" + result.getName() + " with status +" + status );
			retrycount++;
			return true;

		}
		return false;
	}

}