package testNGSessions;

import org.testng.annotations.Test;

public class DependsonMethodConcept {
	
	
	@Test
	public void logintest() {
		System.out.println("lLogin");
		int i = 9/0;
	}

	
	@Test(dependsOnMethods = "logintest")
	public void cogintest() {
		System.out.println("cLogin");
	}

	@Test
	public void aogintest() {
		System.out.println("aLogin");
	}

}
