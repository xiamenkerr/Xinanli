package severPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.fuwu;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class fengxian_guankong {
	public void run_fengxian(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.环境风险评估
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.fengxianpinggu_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.fengxianpinggu_check);
		assertEquals(spy.target_xpath(fuwu.fengxianpinggu_check).getText(), "环境风险评估","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//2.环境风险安全隐患排查
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.yinhuanpaicha_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.yinhuanpaicha_check);
		assertEquals(spy.target_xpath(fuwu.yinhuanpaicha_check).getText(), "环境风险安全隐患排查","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//3.环境应急预案
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.yuan_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.yuan_check);
		assertEquals(spy.target_xpath(fuwu.yuan_check).getText(), "环境应急预案","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//4.企业财产保险风险评估
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.qiyecaichan_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.qiyecaichan_check);
		assertEquals(spy.target_xpath(fuwu.qiyecaichan_check).getText(), "企业财产保险风险评估","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//5.安全生产责任保险风险评估
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.shengchanzeren_click).click();
		Thread.sleep(1050);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.shengchanzeren_check);
		assertEquals(spy.target_xpath(fuwu.shengchanzeren_check).getText(), "安全生产责任保险风险评估","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//6.安全生产责任保险保费计算
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.baofeijisuan_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.baofeijisuan_check);
		assertEquals(spy.target_xpath(fuwu.baofeijisuan_check).getText(), "安全生产责任保险保费计算","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//7.危险有害因素辨识
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weixian_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weixian_check);
		assertEquals(spy.target_xpath(fuwu.weixian_check).getText(), "危险有害因素辨识","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//8.危险源辨识
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.weixianyuan_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.weixianyuan_check);
		assertEquals(spy.target_xpath(fuwu.weixianyuan_check).getText(), "危险源辨识","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//9.生产安全事故隐患排查
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.shiguyinhuan_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.shiguyinhuan_check);
		assertEquals(spy.target_xpath(fuwu.shiguyinhuan_check).getText(), "生产安全事故隐患排查","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//10.安全生产标准化咨询
		touch.over(driver, fuwu.fw);
		Thread.sleep(500);
		spy.target_xpath(fuwu.biaozhunhua_click).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(fuwu.biaozhunhua_check);
		assertEquals(spy.target_xpath(fuwu.biaozhunhua_check).getText(), "安全生产标准化咨询","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//打印执行结果
		System.out.println("风险管控服务共10个链接，检测完毕");
	}
}
