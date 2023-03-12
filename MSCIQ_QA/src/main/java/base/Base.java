package base;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
public static RemoteWebDriver driver;
	
	public RemoteWebDriver startApp() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://qa.msciq.io/");
		return driver;
	}
	
	public static void type(WebElement e, String str) {
		e.sendKeys(str);	
		
	}
	public void clear(WebElement e) {
		e.clear();
	}
	public void click(WebElement e)
	{
		e.click();
	}
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	public void quitApp() {
		//driver.quit();
	}
	

}
