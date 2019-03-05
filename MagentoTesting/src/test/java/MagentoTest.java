import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	@Test
	public void mainTest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://magento.com");
		Welcome w=new Welcome(driver);
		w.clickOnMyAcct();
		Login l=new Login(driver);
		l.typeEmail("vineetanand61@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		Home h=new Home(driver);
		h.clickOnLogout();
		driver.quit();
	}
	

}
