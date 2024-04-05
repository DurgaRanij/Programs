package Testng;

import org.testng.annotations.Test;

public class Expriority {
@Test(priority=1)
public void addEmployee() {
	System.out.println("Adding Employee");
}
@Test(priority=2)
public void EditEmployee() {
	System.out.println("Edit Employee");
}
@Test(priority=3)
public void DeleteEmployee() {
	System.out.println("Delete Employee");
}
}

