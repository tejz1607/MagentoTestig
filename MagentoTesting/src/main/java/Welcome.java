

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome { 

WebDriver driver;
By myact=By.linkText("My Account");

public Welcome(WebDriver driver)
{
	this.driver=driver;
}
public void clickOnMyAcct()
{
	driver.findElement(myact).click();
}

}
