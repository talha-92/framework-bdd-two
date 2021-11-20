package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class StepDefinitions extends BaseClass {
    @Given("I open Browser")
    public void i_open_browser() throws InterruptedException {
        driver.get("https://demo.broadleafcommerce.org/");
        System.out.println("I opened Browser");
        Thread.sleep(3000);

    }
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() throws InterruptedException {
        System.out.println("I clicked on the login Page");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(3000);

    }
    @When("I enter username as {string}")
    public void i_enter_username_as(String string) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
    }
    @When("I enter password as {string}")
    public void i_enter_password_as(String string) throws InterruptedException {
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys(string);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);

    }
    @When("I enter username")
    public void i_enter_username() {

    }
    @When("I enter password")
    public void i_enter_password() {

    }
    @Then("I should see the customer welcome page")
    public void i_should_see_the_customer_welcome_page() {

    }
    @Then("I should see the logout button")
    public void i_should_see_the_logout_button() {

    }

}
