package objectRepository;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//veriable declaration
@FindBy(xpath ="//input[@id='input']")private WebElement untxt;//we can write here xpath of particlar element same as
@FindBy(xpath ="")private WebElement pwtxt;
@FindBy(xpath ="")private WebElement lgnbtn;

//initialization contructor design
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//getters

public WebElement getUntxt() {
	return untxt;
}

public WebElement getPwtxt() {
	return pwtxt;
}

public WebElement getLgnbtn() {
	return lgnbtn;
}



}