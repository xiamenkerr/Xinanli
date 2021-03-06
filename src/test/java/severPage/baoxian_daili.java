package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.fuwu;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class baoxian_daili {
	
	public void run_baoxian(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.安全生产责任险
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.anquanzeren_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.anquanzeren_check);
		assertEquals(spy.target_xpath(fuwu.anquanzeren_check).getText(), "安全生产责任险","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//2.环境污染责任险
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.huanjing_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.huanjing_check);
		assertEquals(spy.target_xpath(fuwu.huanjing_check).getText(), "环境污染责任险","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//3.企业财产险
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.caichan_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.caichan_check);
		assertEquals(spy.target_xpath(fuwu.caichan_check).getText(), "企业财产险","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//打印执行结果
		System.out.println("保险代理服务共3个链接，检测完毕");
	}
}
