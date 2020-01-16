package TestScript;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword {
	@Test
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\name\\Documents\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
	}

}
