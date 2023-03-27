package pom_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='openwindow']")
	private WebElement openWindow;
		
	@FindBy(xpath="//input[@id='name']")
	private WebElement enteryourName;
	
	@FindBy(xpath="//input[@id='confirmbtn']")
	private WebElement confirmButton;
	
	@FindBy(xpath="//button[@id='mousehover']")
	private WebElement mousehover;
	
	@FindBy(xpath="//a[text()='Top']")
	private WebElement tophover;
	
	@FindBy(xpath="//a[text()='Reload']")
	private WebElement reloadhover;
	
	@FindBy(xpath="//div[@id='table-example-div']")
	private WebElement webtable;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clickOnOpenWindow() {
		openWindow.click();
	}
	public void handleAlert() throws InterruptedException {
		enteryourName.click();
		Thread.sleep(2000);
		enteryourName.sendKeys("Vaishnavi");
		Thread.sleep(2000);
		confirmButton.click();		
	}
	public void tophover() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(mousehover).perform();
		tophover.click();
		Thread.sleep(2000);
		reloadhover.click();
	}
	//html table
	public void htmlWebtable() {
	List<WebElement> cells = driver.findElements(By.xpath("//div[@id='table-example-div']"));
	for(int i=0;i<cells.size();i++) {
		System.out.print(cells.get(i).getText()+" ");	
	}
	System.out.println();
	}	

}
