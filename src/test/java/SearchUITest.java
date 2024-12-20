import Utils.BaseClass;
import comm.pages.HomePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SearchUITest extends BaseClass {
  @Test
  public void homePageLaunch() throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    homePage.launchPage();
  }

  @Test
  @Parameters("productName")
  public void searchValidProduct(String productName) throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    homePage.launchPage();
    log.info("Web page is loaded now search for product:- "+productName);
    homePage.searchValidProduct(productName);
  }

  @Test
  @Parameters("productName")
  public void searchInvalidProduct(String productName) throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    homePage.launchPage();
    log.info("Web page is loaded now search for product:- "+productName);
    homePage.searchInvalidProduct(productName);

  }



}