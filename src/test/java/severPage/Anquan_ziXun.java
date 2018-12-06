package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Lib.fuwu;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class Anquan_ziXun {
	
	public void anquanzixun(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		touch.over(driver, fuwu.fw);
		String currentWin = driver.getWindowHandle();
		
		//安全托管链接
		spy.target_xpath(fuwu.anquan_tuoguan).click();
		Thread.sleep(500);
		//切换到第二个窗口的句柄
		ff.swich(currentWin, driver);
		wating.waitForElementPresent(fuwu.anquan_check);
		WebElement obj=spy.target_xpath(fuwu.anquan_check);
		assertEquals(obj.getText(), "安全托管", "实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全预评价链接
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.anquanyu_pingjia).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.anquanyu_check);
		assertEquals(spy.target_xpath(fuwu.anquanyu_check).getText(), "安全预评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全验收评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.anquanyanshou_pingjia).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.anquanyanshou_check);
		assertEquals(spy.target_xpath(fuwu.anquanyanshou_check).getText(), "安全验收评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全现状评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.anquanxianzhuang_pingjia).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.anquanxianzhuang_check);
		assertEquals(spy.target_xpath(fuwu.anquanxianzhuang_check).getText(), "安全现状评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全生产标准化
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.anquanpd_biaozhun).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.anquanpd_check);
		assertEquals(spy.target_xpath(fuwu.anquanpd_check).getText(), "安全生产标准化","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//重大危险源辨识与评估
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.bigdanger).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.bigdanger_check);
		assertEquals(spy.target_xpath(fuwu.bigdanger_check).getText(), "重大危险源辨识与评估","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全管理培训
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.safemanage_train).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.safemanage_check);
		assertEquals(spy.target_xpath(fuwu.safemanage_check).getText(), "安全管理培训","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全隐患排查
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.safeHidden_trouble).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.safeHidden_check);
		assertEquals(spy.target_xpath(fuwu.safeHidden_check).getText(), "安全隐患排查","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//安全设施设计专篇
		touch.over(driver, fuwu.fw);
		Thread.sleep(1000);
		spy.target_xpath(fuwu.safetyfacilities_design).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.safetyfacilities_check);
		assertEquals(spy.target_xpath(fuwu.safetyfacilities_check).getText(), "安全设施设计专篇","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		
		
//		Thread.sleep(2000);	
		
		
	}
	
}
