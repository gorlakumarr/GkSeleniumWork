package jUintPara;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.Test;

@RunWith(Parameterized.class)
public class AddParamTest {
	private int firstValue;
	private int secondVAlue;
	private int expectedValue;

	Calculator cal;

	@Before
	public void setuo() {
		cal = new Calculator();
	}

	public AddParamTest(int expectedValue, int firstValue, int secondVAlue) {
		this.expectedValue = expectedValue;
		this.firstValue = firstValue;
		this.secondVAlue = secondVAlue;

	}

	@Parameters
	public static Collection<Object[]> testData() {
		Object[][] data = new Object[][] { { 6, 2, 4 }, { 5, 3, 2 } };
		return Arrays.asList(data);

	}

	@Test
	public void testAdd() {
		int sum = firstValue + secondVAlue;
		System.out.println(sum);
		System.out.println(expectedValue);
		cal.add(firstValue, secondVAlue);

	}

}
