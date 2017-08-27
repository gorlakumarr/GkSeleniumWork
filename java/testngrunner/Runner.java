package testngrunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) {

		TestNG runner = new TestNG();

		List<String> list = new ArrayList<String>();
		list.add("C:\\Selinium\\Selenium\\test-output\\Failed suite [Suite]\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
