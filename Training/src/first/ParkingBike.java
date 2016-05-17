package first;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ParkingBike {

	
	@Test(groups="bike" ,priority=1)
	public void getSplendor() {
		System.out.println("Take Splen out");

	}

	@Test(groups="bike" ,priority=-2)
	public void getCbz() {
		System.out.println("Take CBZ out");
	}
	
	
	@Test(groups="bike")
	public void getFz() {
		System.out.println("Take Fz out");
	}

	@Test(dependsOnGroups = "bike")
	public void getShine() {
		System.out.println("Take HondShine out");

	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Ignition ON");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Ignition OFF ");
	}



}
