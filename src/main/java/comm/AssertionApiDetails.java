package comm;

import comm.pojo.response.ResponsePojo;
import io.restassured.response.Response;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.testng.asserts.SoftAssert;

public class AssertionApiDetails {
    public static Logger logger = Logger.getLogger(AssertionApiDetails.class);

    public void assertPositiveResponse(SoftAssertions softAssertions,Response response, ResponsePojo responsePojo, String productName){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(response.getStatusCode(), 200);
        System.out.println("Api Status code:- "+response.getStatusCode());
        for(int i=0;i< responsePojo.items.size();i++)
        {
            softAssert.assertEquals(responsePojo.items.get(i).title.contains(productName),true);
        }



    }

}
