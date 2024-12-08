package comm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.function.Function;

public class HomePage {

	WebDriver driver;

	private final By logo = By.xpath("//*[@id=\"svg2\"]");
	private final By searchField = By.ById.id("search-field");
	private final By clickButton = By.xpath("//*[@id=\"shopify-section-header\"]/header/section[1]/div/div[1]/form/div/button");
	private final By invalidProductSearchResult=By.xpath("//span[contains(., 'Your search')]");
	private final By validProductSearchResult=By.xpath("//div[@class='snize-search-results-header']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchPage() throws InterruptedException {
		driver.get("https://www.livelyroot.com/");
		Thread.sleep(5000);
		waitForElementNotVisible(driver,logo);
		driver.manage().window().maximize();
		isDisplayed(logo);
	}
	public void searchValidProduct(String productName) throws InterruptedException {
		searchFieldClick(productName);
		waitForElementNotVisible(driver,validProductSearchResult);
		isDisplayed(validProductSearchResult);
		System.out.println("Showing results for "+productName+":- "+driver.findElement(validProductSearchResult).getText());
	}

	public void searchInvalidProduct(String productName) throws InterruptedException {
		searchFieldClick(productName);
		waitForElementNotVisible(driver,invalidProductSearchResult);
		isDisplayed(invalidProductSearchResult);
		System.out.println("Showing results for "+productName+":- "+driver.findElement(invalidProductSearchResult).getText());
	}


	public void isDisplayed(Object object){
		driver.findElement((By) object).isDisplayed();
	}

	public void waitForElementNotVisible(WebDriver driver, By productXpath) {
		// FluentWait instance with a timeout of 120 seconds, polling every 500 ms
		FluentWait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(120))           // Total wait time (120 seconds)
				.pollingEvery(Duration.ofMillis(500))          // Check the condition every 500 milliseconds
				.ignoring(NoSuchElementException.class);       // Ignore NoSuchElementException during the wait

		// Wait until the element is clickable
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				// Locate the element
				WebElement elem = driver.findElement(productXpath);

				// Return the element if it's clickable
				if (elem.isDisplayed()) {
					return elem;
				} else {
					return null; // Keep waiting if the element is not yet clickable
				}
			}
		});
	}

		public void searchFieldClick(String productName) throws InterruptedException {
		driver.findElement(searchField).click();
		driver.findElement(searchField).sendKeys(productName);
		driver.findElement(clickButton).click();
		Thread.sleep(5000);
	}



}
