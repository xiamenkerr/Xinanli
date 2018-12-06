package yanjiupage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Lib.hangyeyanjiu;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class hangye {
	public void run_hangyeyanjiu(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		//进入行业研究		
		spy.target_xpath(hangyeyanjiu.yanjiu_click).click();
//		Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		ff.swich(currentWin, driver);
		
		spy.target_xpath(hangyeyanjiu.hot_click).click();
		spy.target_xpath(hangyeyanjiu.hangye_click).click();
		spy.target_xpath(hangyeyanjiu.ex_click).click();
		
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
	}
}
