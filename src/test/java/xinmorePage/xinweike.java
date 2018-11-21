package xinmorePage;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import Lib.xin_more;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class xinweike {
	public void run_xinweike(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//1.鑫微客
		wating.waitForElementIsEnable(xin_more.xwk);
		spy.target_xpath(xin_more.xwk).click();
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.fuzx_click);
		spy.target_xpath(xin_more.fuzx_click).click();
		assertEquals(spy.target_xpath(xin_more.fuzx_check).getText(), "服务中心","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//更多
		//2.法律法规检索
		Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.more_over);
		touch.over(driver, xin_more.more_over);
		Thread.sleep(1000);
		spy.target_xpath(xin_more.falv_click).click();
		Thread.sleep(500);	
		ff.swich(currentWin, driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		assertEquals(driver.getTitle(), "法律法规智能数据库","实际与期望不一致");
		wating.waitForElementIsEnable(xin_more.falv_check);
		assertEquals(spy.target_xpath(xin_more.falv_check).getText(), "全部","实际与期望不一致");		
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//3.智慧EHS		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.more_over);
		touch.over(driver, xin_more.more_over);
		Thread.sleep(1000);
		wating.waitForElementIsEnable(xin_more.ehs_click);
		spy.target_xpath(xin_more.ehs_click).click();		
		Thread.sleep(500);
		ff.swich(currentWin, driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.ehs_check);
		assertEquals(spy.target_xpath(xin_more.ehs_check).getText(), "产品页","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//4.同安风控
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.more_over);
		touch.over(driver, xin_more.more_over);
		Thread.sleep(1000);
		wating.waitForElementIsEnable(xin_more.tongan_click);	
		spy.target_xpath(xin_more.tongan_click).click();	
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.tongan_check);
		assertEquals(spy.target_xpath(xin_more.tongan_check).getText(), "免费发布需求","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//5.双重预控系统
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.more_over);
		touch.over(driver, xin_more.more_over);
		Thread.sleep(1000);
		wating.waitForElementIsEnable(xin_more.shouye_click);
		spy.target_xpath(xin_more.shouye_click).click();	
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.shouye_check);
		assertEquals(spy.target_xpath(xin_more.shouye_check).getText(), "首页","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//6.排污许可证
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.more_over);
		touch.over(driver, xin_more.more_over);
		Thread.sleep(1000);
		wating.waitForElementIsEnable(xin_more.paiwu_click);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		spy.target_xpath(xin_more.paiwu_click).click();		
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.paiwu_check);
		assertEquals(spy.target_xpath(xin_more.paiwu_check).getText(), "产品介绍","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//7.环保税计算
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.more_over);
		touch.over(driver, xin_more.more_over);
		Thread.sleep(1000);
		wating.waitForElementIsEnable(xin_more.shui_click);
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		spy.target_xpath(xin_more.shui_click).click();	
		Thread.sleep(1000);
		ff.swich(currentWin, driver);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(xin_more.shui_check);
		assertEquals(spy.target_xpath(xin_more.shui_check).getText(), "返回安环家","实际与期望不一致");
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
		
		//打印执行结果
		System.out.println("鑫微客+更多共7个链接，检测完毕");
		
	}
}
