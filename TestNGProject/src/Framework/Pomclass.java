package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass 
{
	@FindBy(xpath = "//a[.='Register']")
	private WebElement reg;
	@FindBy(xpath = "//input[@id='gender-male']")
	private WebElement maleradio;
	@FindBy(id="FirstName")
	private WebElement f_n;
	@FindBy(id="LastName")
	private WebElement l_n ;
	@FindBy(id="Email")
	private WebElement mail;
	@FindBy(id="Password")
	private WebElement passw;
	@FindBy(id="ConfirmPassword")
	private WebElement confirm;
	@FindBy(id="register-button")
	private WebElement register;
	
	public Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void reg_link()
	{
		reg.click();
	}
	public void male_rd()
	{
		maleradio.click();
	}
	public void first_name()
	{
		f_n.click();
	}
	public void last_name()
	{
		l_n.click();
	}
	public void Email()
	{
		mail.click();
	}
	public void pass()
	{
		passw.click();
	}
	public void con_pass()
	{
		confirm.click();
	}
	public void reg_but()
	{
		register.click();
	}
}
