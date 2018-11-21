package basePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import Lib.urls;

public class TurnOn_driver {
	
	public WebDriver driver;
	
	public class process{
		public GeckoDriverService service;
		
		public GeckoDriverService starserv() throws IOException {
			GeckoDriverService service = new GeckoDriverService.Builder() .usingDriverExecutable
					(new File("D:\\Program Files\\fox-driver\\geckodriver.exe")).usingAnyFreePort().build();
		service.start();
		return service;
		}
		
		public void stopSer() {
			service.stop();
		}
	}
	
	process pro=new process();
	//启动火狐浏览器
	public WebDriver setupFirfox() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(urls.ahj);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
//		System.out.println(driver);
//		String currentWin2 = driver.getWindowHandle();
//		System.out.println(currentWin2);
		return driver;
	}
	
	//关闭浏览器
	public void teardownBrowser() throws Exception{
		Thread.sleep(500);
//		driver.close(); 
		driver.quit();
//		pro.stopSer();
	} 
}
