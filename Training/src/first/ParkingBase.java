package first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ParkingBase {

	@BeforeSuite(alwaysRun = true)
	public void findAddress() {
		System.out.println("Go to building form house");
	}

	@AfterSuite(alwaysRun = true)
	public void returnToHouse() {
		System.out.println("Back to home");
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Open the parking gate!!");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {

		System.out.println("Close the parking gate !!");
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		System.out.println("Open the security gate");
	}

	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("Close the security gate !! ");
	}

}
