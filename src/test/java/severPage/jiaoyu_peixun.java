package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.fuwu;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class jiaoyu_peixun {
	public void run_jiaoyu(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.消防安全培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.xiaofang_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.xiaofang_check);
		assertEquals(spy.target_xpath(fuwu.xiaofang_check).getText(), "消防安全培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);

		//2.环境安全培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.huanjingpeixun_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.huanjingpeixun_check);
		assertEquals(spy.target_xpath(fuwu.huanjingpeixun_check).getText(), "环境安全培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);

		//3.电气安全培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.dianqi_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.dianqi_check);
		assertEquals(spy.target_xpath(fuwu.dianqi_check).getText(), "电气安全培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);

		//4.安全生产教育培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.jiaoyu_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.jiaoyu_check);
		assertEquals(spy.target_xpath(fuwu.jiaoyu_check).getText(), "安全生产教育培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);

		//5.职业病防治教育培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.zhiyebing_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.zhiyebing_check);
		assertEquals(spy.target_xpath(fuwu.zhiyebing_check).getText(), "职业病防治教育培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);

		//6.注安师考试培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.zhuanshi_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.zhuanshi_check);
		assertEquals(spy.target_xpath(fuwu.zhuanshi_check).getText(), "注安师考试培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//打印执行结果
		System.out.println("教育培训共6个链接，检测完毕");
	}
}
