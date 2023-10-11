package testNGFramework;

import org.testng.annotations.Test;

public class GroupingConcept {
	@Test(groups="ODD")
	public void f1() {
		System.out.println("Printing f1");
	}
	@Test(groups="EVEN")
	public void f2() {
		System.out.println("Printing f2");
	}
	@Test(groups="ODD")
	public void f3() {
		System.out.println("Printing f3");
	}
	@Test(groups="EVEN")
	public void f4() {
		System.out.println("Printing f4");
	}
	@Test(groups="ODD")
	public void f5() {
		System.out.println("Printing f5");
	}
}
