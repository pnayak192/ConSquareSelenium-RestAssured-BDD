package contentSquareAutomation.stepdefinations;

import contentSquareAutomation.context.TestContext;
import contentSquareAutomation.domainobjects.Product;
import contentSquareAutomation.pages.CartPage;
import contentSquareAutomation.pages.PageFactoryManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStepDefinitions {
    private final CartPage cartPage;

    public CartStepDefinitions(TestContext context){
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(int quantity, Product product) {
        Assert.assertEquals(product.getName(), cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());
    }
}
