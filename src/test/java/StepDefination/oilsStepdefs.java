package StepDefination;

import Core.Helper;
import Pom.OilsElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class oilsStepdefs {
    WebDriver driver;
    OilsElement element;
    @Given("^login to the website$")
    public void loginToTheWebsite() throws InterruptedException {
        Helper helper= new Helper();
        driver = helper.chromeLaunch();

    }

    @When("choose cookups")
    public void chooseCookups() throws InterruptedException {
        element=new OilsElement(driver);
        element.Cookups();
        element.switchToCockup();
    }

    /*@And("switch to new window")
    public void switchToNewWindow() throws InterruptedException {
        Thread.sleep(2000);
        element.Sam();
    }*/
    @And("Search to the items {string}")
    public void searchToTheItemsName(String name) throws InterruptedException{
        element.Search(name);
    }

    @And("click the choose items")
    public void clickTheChooseItems() throws InterruptedException {
        element.SelectItem();
    }

    @And("order now")
    public void orderNow() throws InterruptedException {
        Thread.sleep(2000);
        element.OrderNow();
        element.switchBackToChaldal();
    }

    @Then("to the next page")
    public void toTheNextPage() {
        System.out.println("..............................");
    }


}
