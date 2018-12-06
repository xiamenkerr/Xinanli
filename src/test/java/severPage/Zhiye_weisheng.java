package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.fuwu;
import basePage.get_ready;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class Zhiye_weisheng {
	
	public void runzhiye(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.职业病危害预评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weihaiyu_pingjia).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weihaiyu_check);
		assertEquals(spy.target_xpath(fuwu.weihaiyu_check).getText(), "职业病危害预评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//2.职业病危害控制效果评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weihaikongzhi_pingjia).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weihaikongzhi_check);
		assertEquals(spy.target_xpath(fuwu.weihaikongzhi_check).getText(), "职业病危害控制效果评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//3.职业病危害现状评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weihaixianzhuang_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weihaixianzhuang_check);
		assertEquals(spy.target_xpath(fuwu.weihaixianzhuang_check).getText(), "职业病危害现状评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//4.职业病危害因素检测
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weihaiyinsu_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weihaiyinsu_check);
		assertEquals(spy.target_xpath(fuwu.weihaiyinsu_check).getText(), "职业病危害因素检测","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//5.放射卫生检测评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weishengjiance_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weishengjiance_check);
		assertEquals(spy.target_xpath(fuwu.weishengjiance_check).getText(), "放射卫生检测评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//6.职业病危害因素委托检测
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weituo_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weituo_check);
		assertEquals(spy.target_xpath(fuwu.weituo_check).getText(), "职业病危害因素委托检测","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//7.职业病防护设施设计专篇
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.fanghusheji_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.fanghusheji_check);
		assertEquals(spy.target_xpath(fuwu.fanghusheji_check).getText(), "职业病防护设施设计专篇","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//打印执行结果
		System.out.println("职业卫生共7个链接，检测完毕");
	}
}
