package testNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 5)
	public void logintest() {
		System.out.println("lLogin");
		int i = 9/0;
		System.out.println("Reprint");
	}
	

}
