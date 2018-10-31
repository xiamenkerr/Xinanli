package basePage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Lib.urls;

public class TurnOn_driver {
	
	public WebDriver driver;
	//启动火狐浏览器
	public WebDriver setupFirfox(){
		driver = new FirefoxDriver();
		driver.get(urls.ahj);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		System.out.println(driver);
//		String currentWin2 = driver.getWindowHandle();
//		System.out.println(currentWin2);
		return driver;
	}
	
	//关闭浏览器
	public void teardownBrowser() throws Exception{
		Thread.sleep(1000);
//		driver.close(); 
		driver.quit();
	} 
}
