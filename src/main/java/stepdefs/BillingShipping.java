package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class BillingShipping extends BaseClass{
    @Given("I click on same Shipping address")
    public void i_click_on_same_shipping_address() throws InterruptedException {
        System.out.println("same address");
        driver.findElement(By.id("shouldUseShippingAddress1")).click();
        Thread.sleep(2000);
    }
    @Given("I click on credit card")
    public void i_click_on_credit_card() throws InterruptedException {
        System.out.println("card opp");
        driver.findElement(By.xpath("//a[@href='#CreditCard']")).click();
        Thread.sleep(2000);
    }
    @When("I enter the card number")
    public void i_enter_the_card_number() throws InterruptedException {
        System.out.println("Card number");
        driver.findElement(By.id("cardNumber")).sendKeys("1111222233334444");
        Thread.sleep(2000);
    }
    @When("I enter security code")
    public void i_enter_security_code() throws InterruptedException {
        System.out.println("code");
        driver.findElement(By.id("securityCode")).sendKeys("123");
        Thread.sleep(2000);

    }
    @When("I enter the expiration of the card")
    public void i_enter_the_expiration_of_the_card() throws InterruptedException {
        System.out.println("expiration:");
        driver.findElement(By.id("cardExpDate")).sendKeys("01/23");
        Thread.sleep(2000);
    }
    @When("I save the card for next time")
    public void i_save_the_card_for_next_time() {
        System.out.println("saving card");
        driver.findElement(By.xpath("(//i[@class='material-icons'])[7]")).click();
    }
    @When("I click on continue")
    public void i_click_on_continue() throws InterruptedException {
        System.out.println("click continue");
        driver.findElement(By.xpath("(//a[@class='btn btn-primary pull-right js-performCheckout'])[1]")).click();
        Thread.sleep(2000);
    }
    @Then("I should be able to complete the transaction")
    public void i_should_be_able_to_complete_the_transaction() {
    }

}
