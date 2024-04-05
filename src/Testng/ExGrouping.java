package Testng;

import org.testng.annotations.Test;

public class ExGrouping {
	@Test(groups= {"smoke"})
	public void addadmin() {
		System.out.println("Adding admin");
	}
	@Test(groups= {"smoke"})
	public void addJobTitle() {
		System.out.println("Adding Job Title");
	}
	@Test(groups={"smoke","Regression"})
	public void addEmployee() {
		System.out.println("Adding Employee");
	}
	@Test(groups= {"sanity"})
	public void EditEmployee() {
		System.out.println("Edit Employee");
	}
	@Test(groups= {"Regression"})
	public void DeleteEmployee() {
		System.out.println("Delete Employee");
	}
}
