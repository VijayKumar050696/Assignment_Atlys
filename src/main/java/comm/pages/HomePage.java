package comm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	private final By logo = By.ById.id("svg2");
	private final By searchField = By.ById.id("search-field");
	private final By clickButton = By.xpath("//*[@id=\"shopify-section-header\"]/header/section[1]/div/div[1]/form/div/button");
	private final By serchResult= By.xpath("//*[@id=\"snize_results\"]/div[2]/div");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchPage() throws InterruptedException {
		driver.get("https://www.livelyroot.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		isDisplayed(logo);
	}
	public void searchProduct(String productName) throws InterruptedException {
		searchFieldClick(productName);
		isDisplayed(serchResult);
		System.out.println(driver.findElement(serchResult).getText());
	}


	public void isDisplayed(Object object){
		driver.findElement((By) object).isDisplayed();
	}

	public void searchFieldClick(String productName) throws InterruptedException {
		driver.findElement(searchField).click();
		driver.findElement(searchField).sendKeys(productName);
		driver.findElement(clickButton).click();
		Thread.sleep(5000);
	}



}
