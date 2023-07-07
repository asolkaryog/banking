package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfoPage {
//declaration
	@FindBy(xpath ="")private WebElement orgHeaderTxt;

	//initiliazatio
	public OrgInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//utilization getters

	public WebElement getOrgHeaderTxt() {
		return orgHeaderTxt;
	}
	

}
