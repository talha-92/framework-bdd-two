package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CheckOut extends BaseClass{
    @When("I click on checkout")
    public void i_click_on_checkout() {
        System.out.println("click on checkout");
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
    }
    @When("I enter full name")
    public void i_enter_full_name() {
        System.out.println("enter the full name");
        driver.findElement(By.xpath("//*[@id='fullName']")).sendKeys("ta and");
    }
    @When("I enter address")
    public void i_enter_address() throws InterruptedException {
        System.out.println("entered address");
        driver.findElement(By.id("addressLine1")).sendKeys("102-33, 34th ST");
        Thread.sleep(2000);
    }
    @When("I enter address part two")
    public void i_enter_address_part_two() throws InterruptedException {
        System.out.println("apt #");
        driver.findElement(By.id("addressLine2")).sendKeys("APT# 1");
        Thread.sleep(2000);

    }
    @When("I input the city")
    public void i_input_the_city() throws InterruptedException {
        System.out.println("city");
        driver.findElement(By.id("city")).sendKeys("New York");
        Thread.sleep(2000);
    }
    @When("I enter the state")
    public void i_enter_the_state() throws InterruptedException {
        System.out.println("State and postal code");
        driver.findElement(By.id("stateProvinceRegion")).sendKeys("NY");
        Thread.sleep(2000);
        driver.findElement(By.id( "postalCode")).sendKeys("11111");
    }
    @When("I enter phone")
    public void i_enter_phone() throws InterruptedException {
        System.out.println("phone number");
        driver.findElement(By.xpath( "//*[@id='shippingInfo']/div/div[1]/div/div/div[5]/div/div")).sendKeys("222-333-4444");
        Thread.sleep(2000);
    }
    @When("I selected shipping method")
    public void i_selected_shipping_method() throws InterruptedException {
        System.out.println("method option");
        driver.findElement(By.id("fulfillmentOptionId1")).click();
        Thread.sleep(2000);

    }
    @Then("I should continue")
    public void i_should_continue() throws InterruptedException {
        System.out.println("checkout please");
        driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right js-submitCheckoutStage'] ")).click();
        Thread.sleep(2000);
    }


}

