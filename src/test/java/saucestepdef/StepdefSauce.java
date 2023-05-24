package saucestepdef;

import base.BaseSauce;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LocPages;

import java.time.Duration;

import org.openqa.selenium.chrome.*;

public class StepdefSauce extends BaseSauce {
	
	LocPages lp = new LocPages();
	
	@Given("Customer launches the page and enters {string} and password to login")
	public void customer_launches_the_page_and_enters_and_password_to_login(String username) {
	    
	}
	
	@Given("Customer launches the page and login to sauce demo page")
	public void customer_launches_the_page_and_login_to_sauce_demo_page() {
	    ChromeOptions opt= new ChromeOptions();
	    opt.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(opt);
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	    driver.findElement(lp.usernameloc).sendKeys("standard_user");
	    driver.findElement(lp.passwordloc).sendKeys("secret_sauce");
	    driver.findElement(lp.loginbtnloc).click();
	    
	}

	@When("Customer navigates to home page and select the product to purchase")
	public void customer_navigates_to_home_page_and_select_the_product_to_purchase() {
	    driver.findElement(lp.filterloc).click();
	    driver.findElement(lp.filteropt).click();
	    driver.findElement(lp.addtocartloc).click();
	}

	@When("Customer visits the cart and checkout the product")
	public void customer_visits_the_cart_and_checkout_the_product() {
	    driver.findElement(lp.movetocartloc).click();
	    
	    driver.findElement(lp.checkoutloc).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@When("Cutomer enters the contact information and gets payment info")
	public void cutomer_enters_the_contact_information_and_gets_payment_info() {
	    driver.findElement(lp.firstnameloc).sendKeys("Indhira");
	    driver.findElement(lp.lastnameloc).sendKeys("Durai");
	    driver.findElement(lp.zipcodeloc).sendKeys("600019");
	    driver.findElement(lp.continuebtnloc).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	    driver.findElement(lp.finishbtnloc).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Then("Customer got an order confirmation message")
	public void customer_got_an_order_confirmation_message() {
//		String msg = "Thank you for your order!";
//		Assert.assertEquals(driver.findElement(lp.confirmmsgloc).getText(), msg);
		System.out.println(driver.findElement(lp.confirmmsgloc).getText());
		driver.findElement(lp.backhomeloc).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.quit();

	}
}
