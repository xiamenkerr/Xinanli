package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.fuwu;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class xiaofang_anquan {
	
	public void run_xiaofang(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.消防安全评估
		touch.over(driver, fuwu.fw);
		spy.target_xpath(fuwu.pinggu_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.pinggu_check);
		assertEquals(spy.target_xpath(fuwu.pinggu_check).getText(), "消防安全评估","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//2.消防设施检测
		touch.over(driver, fuwu.fw);
		spy.target_xpath(fuwu.jiance_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.jiance_check);
		assertEquals(spy.target_xpath(fuwu.jiance_check).getText(), "消防设施检测","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//3.消防设施维保
		touch.over(driver, fuwu.fw);
		spy.target_xpath(fuwu.weibao_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weibao_check);
		assertEquals(spy.target_xpath(fuwu.weibao_check).getText(), "消防设施维保","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//4.消防工程设计
		touch.over(driver, fuwu.fw);
		spy.target_xpath(fuwu.sheji_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.sheji_check);
		assertEquals(spy.target_xpath(fuwu.sheji_check).getText(), "消防工程设计","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//5.消防安全培训
		touch.over(driver, fuwu.fw);
		spy.target_xpath(fuwu.peixun_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.peixun_check);
		assertEquals(spy.target_xpath(fuwu.peixun_check).getText(), "消防安全培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//6.消防安全管理体系
		touch.over(driver, fuwu.fw);
		spy.target_xpath(fuwu.tixi_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.tixi_check);
		assertEquals(spy.target_xpath(fuwu.tixi_check).getText(), "消防安全管理体系","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//打印执行结果
		System.out.println("消防安全服务共6个链接，检测完毕");
	}
}
