package contentSquareAutomation.stepdefinations;

import contentSquareAutomation.apis.CommentsAPI;
import contentSquareAutomation.context.TestContext;
import contentSquareAutomation.pages.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WeatherForecastCalls {
    CommentsAPI commentsAPI;
    private final TestContext context;

    public WeatherForecastCalls(TestContext context){
        this.context = context;
    }
    @Given("I make a request to comments Api and Capture the data")
    public void makeARequestToApi()
    {
        new CommentsAPI(context);
    }

}
