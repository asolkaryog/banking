package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationLookupPage {
	//declaration
	
@FindBy(xpath ="")private WebElement orglookUPImg;

//initalization
public OrganizationLookupPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}	
	//utilization

public WebElement getOrglookUPImg() {
	return orglookUPImg;
}
	

}
