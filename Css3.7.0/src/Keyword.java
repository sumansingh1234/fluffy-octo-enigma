import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.*;

public class Keyword {

	@Test
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\name\\Documents\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https:facebook.com");
		String strActual="https://www.facebook.com/";
		String expectedurl=driver.getCurrentUrl();
		System.out.println(expectedurl);
		Assert.assertEquals(strActual, expectedurl);
		
		
		
	}

}
