package letsCOdeit;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Package.AllCourses;
import pom_Package.HomePage;

public class CodeTest_Class1 {
	
	
	public static void main (String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://courses.letskodeit.com/practice");
	HomePage hpage = new HomePage(driver);
//	hpage.clickOnOpenWindow();
	//child browser code
//	ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(list.get(1));
//	System.out.println(list);
//	AllCourses all = new AllCourses(driver);
//	all.chooseAPIAuto();
	//handle alert
//	Thread.sleep(3000);
//	hpage.handleAlert();
//	Thread.sleep(3000);
//	Alert alt =driver.switchTo().alert();
//	Thread.sleep(3000);
//	alt.accept();
//	Thread.sleep(3000);
//	hpage.tophover();
//	Thread.sleep(3000);
	//handle html table
	hpage.htmlWebtable();
	driver.close();
	
	

	}

}
