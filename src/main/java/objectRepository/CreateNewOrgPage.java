package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
//declaration all element declred as privte
	@FindBy(xpath ="")private WebElement orgNametxt;
	@FindBy(xpath ="")private WebElement saveBtn;

//initialization
	public CreateNewOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//utilization generate gettters

	public WebElement getOrgNametxt() {
		return orgNametxt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

}
