package contentSquareAutomation.stepdefinations;

import com.google.gson.JsonObject;
import org.json.JSONObject;
import contentSquareAutomation.constants.EndPoint;
import contentSquareAutomation.context.TestContext;
import contentSquareAutomation.pages.InformationPage;
import contentSquareAutomation.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class IngormationUIStepDefinitions {
    private final InformationPage informationPage;
    private final TestContext context;

    public IngormationUIStepDefinitions(TestContext context){
        this.context = context;
        informationPage = PageFactoryManager.getInfoPage(context.driver);
    }

    @Given("I navigate to comments page")
    public void iMOnTheCommentsPage() {
        informationPage.load(EndPoint.DATA.url);
    }

    @Then("I capture the data on UI and validate with API")
    public void iGetTheDataFromUIAndValidateWithAPI()
    {

        JSONObject prodData = new JSONObject(informationPage.getProductData());

        Assert.assertEquals(context.getCurrentAPIResponse.getBody(), prodData.get("body"));
        Assert.assertEquals(context.getCurrentAPIResponse.getId(), prodData.get("id"));
        Assert.assertEquals(context.getCurrentAPIResponse.getName(), prodData.get("name"));
        Assert.assertEquals(context.getCurrentAPIResponse.getEmail(), prodData.get("email"));
        Assert.assertEquals(context.getCurrentAPIResponse.getPostId(), prodData.get("postId"));
    }
}
