package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddtoCart extends BaseClass{
    @Given("I navigate to login page")
    public void i_navigate_to_login_page() throws InterruptedException {
        System.out.println("I clicked on the login Page");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(3000);
    }
    @When("I enter username a username")
    public void i_enter_username_a_username() throws InterruptedException {
        System.out.println("username");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc123@me.com");
        Thread.sleep(3000);


    }
    @When("I enter password the password")
    public void i_enter_password_the_password() throws InterruptedException {
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("abc123");
        Thread.sleep(3000);

    }
    @When("I click login")
    public void i_click_login() throws InterruptedException {
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);


    }
    @When("I click on image")
    public void i_click_on_image() throws InterruptedException {
        System.out.println("I clicked on the product");
        driver.findElement(By.xpath("//div[@class='js-image image card-image']")).click();
        Thread.sleep(2000);

    }
    @When("I click add to cart")
    public void i_click_add_to_cart() throws InterruptedException {
        System.out.println("I added to the cart");
        driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-xs hidden-xs btn-add-to-cart js-addToCart'])[3]")).click();
        Thread.sleep(2000);
    }
    @Then("I should be able to view the cart")
    public void i_should_be_able_to_view_the_cart() throws InterruptedException {
        System.out.println("I view the cart");
        driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']")).click();
        Thread.sleep(2000);


    }

}
