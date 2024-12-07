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
  public void searchProduct(String productName) throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    homePage.launchPage();
    homePage.searchProduct(productName);
  }

  @Test
  @Parameters("productName")
  public void searchInvalidProduct(String productName) throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    homePage.launchPage();
    homePage.searchProduct(productName);

  }



}