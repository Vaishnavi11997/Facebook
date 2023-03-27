package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IframePage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//div[@id='zen_all_courses_dynamic']")
	private WebElement iframe;
	
	@FindBy(xpath="//select [@name='categories']")
	private WebElement categories;
	
	public IframePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	public void handleIframe() throws InterruptedException {
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		Select sel = new Select (categories);
		Thread.sleep(2000);
		sel.selectByVisibleText("Selenium WebDriver");;
		
	}
	

}
