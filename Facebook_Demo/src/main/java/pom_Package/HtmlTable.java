package pom_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HtmlTable {
	private WebDriver driver;
	
	@FindBy (xpath ="")
	private WebElement htmlTable;
	
	public HtmlTable(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	public void handleHTMLTable() {
	List <WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']"));
	for (int i=0;i<cells.size();i++) {
	System.out.print(cells.get(i).getText()+" ");
	}
	System.out.println();
	}

}
