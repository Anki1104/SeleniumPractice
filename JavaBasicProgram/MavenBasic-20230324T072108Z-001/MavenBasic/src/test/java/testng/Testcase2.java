package testng;

import org.testng.annotations.Test;

public class Testcase2 {

	@Test
	public void testCase1() {
		System.out.println("Tc1");
	}

	@Test
	public void testCase2() {
		System.out.println("Tc2");
	}

	@Test
	public void testCase3() {
		System.out.println("TC3");
		testCase4();
	}

	public void testCase4() {
		System.out.println("TC4");
	}
}
