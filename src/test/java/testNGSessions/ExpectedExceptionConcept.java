package testNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void logintest() {
		System.out.println("lLogin");
		int i = 9/0;
		System.out.println("Reprint");
	}
	
	
}
