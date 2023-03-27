package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AllCourses {
	
	@FindBy(xpath="//select[@name='categories']")
	private WebElement categoryListBox;
	
	@FindBy(xpath="//option[text()='API Automation']")
	private WebElement apiAutomation;
	
	public AllCourses(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void chooseAPIAuto() throws InterruptedException {
		categoryListBox.click();
		Thread.sleep(2000);
		Select  sel = new Select(categoryListBox);
		sel.selectByIndex(6);
	}

}
