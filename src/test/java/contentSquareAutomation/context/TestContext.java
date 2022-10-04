package contentSquareAutomation.context;

import contentSquareAutomation.domainobjects.BillingDetails;
import contentSquareAutomation.domainobjects.Cookies;
import contentSquareAutomation.pojoDeserialization.getWeather.GetCurrent;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public WebDriver driver;
    public BillingDetails billingDetails;
    public Cookies cookies;

    public GetCurrent getCurrentAPIResponse;

    public TestContext(){
        cookies = new Cookies();
        cookies.setCookies(new io.restassured.http.Cookies());
    }
}
