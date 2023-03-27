package letsCOdeit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Package.HtmlTable;
import pom_Package.IframePage;

public class HtmlTestclass {
	private WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		//HtmlTable table = new HtmlTable(driver);
		//table.handleHTMLTable();
		driver .get("https://courses.letskodeit.com/practice");
		IframePage page = new IframePage(driver);
		page.handleIframe();
		driver.close();
		
		

	}

}
