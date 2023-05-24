package pages;

import org.openqa.selenium.By;

public class LocPages {

	public By usernameloc = By.xpath("//input[@name='user-name']"); //standard_user
	public By passwordloc = By.xpath("//input[@name='password']");//secret_sauce
	public By loginbtnloc = By.xpath("//input[@name='login-button']");
	public By filterloc = By.xpath("//select[@class='product_sort_container']");//Name (Z to A)
	public By filteropt = By.xpath("//option[text()='Name (Z to A)']");
	public By addtocartloc = By.xpath("(//button[text()='Add to cart'])[1]");
	public By movetocartloc = By.xpath("//a[@class='shopping_cart_link']");
	public By checkoutloc = By.xpath("//button[text()='Checkout']");
	public By firstnameloc = By.xpath("//input[@name='firstName']");
	public By lastnameloc = By.xpath("//input[@name='lastName']");
	public By zipcodeloc = By.xpath("//input[@name='postalCode']");
	public By continuebtnloc = By.xpath("//input[@name='continue']");
	public By finishbtnloc = By.xpath("//button[@name='finish']");
	public By confirmmsgloc = By.xpath("//h2[text()='Thank you for your order!']");
	public By backhomeloc = By.xpath("//button[text()='Back Home']");
	
	
}
