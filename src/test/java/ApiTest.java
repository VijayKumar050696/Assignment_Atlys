import comm.AssertionApiDetails;
import comm.BaseClass.BaseTest;
import comm.pojo.response.ResponsePojo;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static io.restassured.RestAssured.given;

public class ApiTest extends BaseTest{

    ResponsePojo responsePojo=new ResponsePojo();
    AssertionApiDetails assertionApiDetails=new AssertionApiDetails();
    SoftAssertions softAssert=new SoftAssertions();
    private static final Logger log = Logger.getLogger(String.valueOf(ApiTest.class));

    @BeforeMethod
    @Parameters("apiKey")
    public void setParametes(String apiKey)
    {
        requestSpecification.queryParams("apiKey",apiKey);
    }

    @Test
    @Parameters("productName")
    public void testGetWidgetsCall(String productName) {
        Response response=requestSpecification.queryParam("q",productName).get();
        log.info(response.prettyPrint());
        responsePojo = response.as(ResponsePojo.class, ObjectMapperType.GSON);
        assertionApiDetails.assertPositiveResponse(softAssert,response,responsePojo,productName);
    }

    @Test
    @Parameters("productName")
    public void WidgetsCallWIthWrongMethod(String productName) {
        Response response=requestSpecification.queryParam("q",productName).put();
        log.info(response.prettyPrint());
        Assert.assertEquals(405,response.getStatusCode());
        System.out.println(response.getStatusCode());
    }

    @Test
    @Parameters("productName")
    public void WidgetsCallWIthWrongparameters(String productName) {
        Response response=requestSpecification.queryParam("q",productName).get();
        log.info(response.prettyPrint());
        Assert.assertEquals(400,response.getStatusCode());
        System.out.println(response.getStatusCode());
    }
}
