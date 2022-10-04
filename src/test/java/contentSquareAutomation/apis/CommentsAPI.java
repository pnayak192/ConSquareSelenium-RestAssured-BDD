package contentSquareAutomation.apis;

import contentSquareAutomation.constants.EndPoint;
import contentSquareAutomation.context.TestContext;
import contentSquareAutomation.pojoDeserialization.getWeather.GetCurrent;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class CommentsAPI {

    private Response response;

    public CommentsAPI(TestContext context){
        context.getCurrentAPIResponse = getComments();
    }

    public GetCurrent getComments(){
        Header header = new Header("content-type", "application/x-form-urlencoded");
        Headers headers = new Headers(header);
        this.response = ApiRequest.get(EndPoint.DATA.url, headers);
        return response.as(GetCurrent.class);
    }

}
