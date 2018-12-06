package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.fuwu;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class huanbao_zixun {

	public void run_huanbao(WebDriver driver) throws InterruptedException {
		
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.建设项目环境影响评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.jianshexiangmu_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.jianshexiangm_check);
		assertEquals(spy.target_xpath(fuwu.jianshexiangm_check).getText(), "建设项目环境影响评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//2.规划环境影响评价
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.guihua_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.guihua_check);
		assertEquals(spy.target_xpath(fuwu.guihua_check).getText(), "规划环境影响评价","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//3.环境监测
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.huanjingjiance_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.huanjingjiance_check);
		assertEquals(spy.target_xpath(fuwu.huanjingjiance_check).getText(), "环境监测","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//4.企业突发环境事件应急预案
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.yingjiyuan_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.yingjiyuan_check);
		assertEquals(spy.target_xpath(fuwu.yingjiyuan_check).getText(), "企业突发环境事件应急预案","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//5.建设项目竣工环境保护验收
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.baohuyanshou_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.baohuyanshou_check);
		assertEquals(spy.target_xpath(fuwu.baohuyanshou_check).getText(), "建设项目竣工环境保护验收","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//6.环境保护工程设计
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.gongchengsheji_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.gongchengsheji_check);
		assertEquals(spy.target_xpath(fuwu.gongchengsheji_check).getText(), "环境保护工程设计","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//7.新版排污许可证咨询
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.zixun_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.zixun_check);
		assertEquals(spy.target_xpath(fuwu.zixun_check).getText(), "新版排污许可证咨询","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//8.环保税咨询
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.huanbaoshui_click).click();
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.huanbaoshui_check);
		assertEquals(spy.target_xpath(fuwu.huanbaoshui_check).getText(), "环保税咨询","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
	}
}
