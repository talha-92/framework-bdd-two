package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Registration extends BaseClass {
    @Given("I navigate to the register page")
    public void i_navigate_to_the_register_page() throws InterruptedException {
        System.out.println("I clicked on the login Page");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(3000);

    }
    @When("I enter firstname")
    public void i_enter_firstname() throws InterruptedException {
        System.out.println("I clicked on the login Page");
        driver.findElement(By.id( "customer.firstName")).sendKeys("ta");
        Thread.sleep(3000);

    }
    @When("I enter lastname")
    public void i_enter_lastname() throws InterruptedException {
        System.out.println("I clicked on the login Page");
        driver.findElement(By.id( "customer.lastName")).sendKeys("ansa");
        Thread.sleep(3000);

    }
    @When("I confirm password")
    public void i_confirm_password() throws InterruptedException {
        System.out.println("enter password");
        driver.findElement(By.xpath( "(//*[@id='password'])[2]")).sendKeys("PWD123");
        Thread.sleep(3000);

    }
    @When("I click register")
    public void i_click_register() throws InterruptedException {
        System.out.println("enter password");
        driver.findElement(By.xpath( "//*[@id='passwordConfirm']")).sendKeys("PWD123");
        Thread.sleep(3000);

    }
    @Then("I should be able to register")
    public void i_should_be_able_to_register() throws InterruptedException {
        System.out.println("I clicked on the login Page");
        driver.findElement(By.xpath("//*[@id='registrationForm']/button")).click();
        Thread.sleep(3000);

    }

}
