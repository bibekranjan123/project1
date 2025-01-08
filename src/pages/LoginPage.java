package pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class LoginPage extends BasePage implements AutoConstant 
{
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void loginMethod() throws IOException, InterruptedException
	{
		javascriptHighlightElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(login_sheet, 1, 0));
		javascriptHighlightElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getStringTypeCellData(login_sheet, 1, 1));
		javascriptHighlightElement(driver, loginButton);
		javascriptClick(driver, loginButton);
		Thread.sleep(3000);
		validateTitle(driver, "actiTIME - Enter Time-Track");
	}
}