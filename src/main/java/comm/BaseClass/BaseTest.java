package comm.BaseClass;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;

import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

  /**
   * Written By : Vijay
   * <p>
   * This is a base class for API Automation, this class can be used to quickly automate any API's
   * using @test annotation in the child class.
   * <p>
   * This Base class uses Restassured, TestNG libraries.
   */

  public static Logger logger = Logger.getLogger(BaseTest.class);
  public static RequestSpecification requestSpecification = given();

  @BeforeClass
  public void beforeClass() {
    requestSpecification.baseUri("http://searchserverapi.com/getwidgets");
    requestSpecification.header("Content-Type", "application/json");
  }

  @AfterTest
  public void afterTest() {
    reset();
  }
}
