package bannerPage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class anquan {
	
	public void run_anquan(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.安全预评价
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.yuping_click);
		spy.target_xpath(banner.yuping_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.anquanyu_check);
		assertEquals(spy.target_xpath(fuwu.anquanyu_check).getText(), "安全预评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//2.安全验收评价
		Thread.sleep(500);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.yanshou_click);
		spy.target_xpath(banner.yanshou_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.anquanyanshou_check);
		assertEquals(spy.target_xpath(fuwu.anquanyanshou_check).getText(), "安全验收评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.安全现状评价
		Thread.sleep(500);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.xianzhuang_click);
		spy.target_xpath(banner.xianzhuang_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.anquanxianzhuang_check);
		assertEquals(spy.target_xpath(fuwu.anquanxianzhuang_check).getText(), "安全现状评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//4.安全生产标准化
		Thread.sleep(500);	
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.biaozhun_click);
		spy.target_xpath(banner.biaozhun_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.anquanpd_check);
		assertEquals(spy.target_xpath(fuwu.anquanpd_check).getText(), "安全生产标准化","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//5.重大危险源辨识与评估
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.bianshi_click);
		spy.target_xpath(banner.bianshi_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.bigdanger_check);
		assertEquals(spy.target_xpath(fuwu.bigdanger_check).getText(), "重大危险源辨识与评估","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//6.安全管理培训
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.guanli_click);
		spy.target_xpath(banner.guanli_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.safemanage_check);
		assertEquals(spy.target_xpath(fuwu.safemanage_check).getText(), "安全管理培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//7.安全隐患排查
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.yinhuan_click);
		spy.target_xpath(banner.yinhuan_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.safeHidden_check);
		assertEquals(spy.target_xpath(fuwu.safeHidden_check).getText(), "安全隐患排查","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//8.安全设施设计专篇
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.sheji_click);
		spy.target_xpath(banner.sheji_click).click();
		Thread.sleep(520);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.safetyfacilities_check);
		assertEquals(spy.target_xpath(fuwu.safetyfacilities_check).getText(), "安全设施设计专篇","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//9.安全托管
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		touch.over(driver, banner.anquan_over);
		wating.waitForElementIsEnable(banner.tuoguan_click);
		spy.target_xpath(banner.tuoguan_click).click();
		Thread.sleep(500);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		wating.waitForElementIsEnable(fuwu.anquan_check);
		assertEquals(spy.target_xpath(fuwu.anquan_check).getText(), "安全托管","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner安全咨询服务共9个链接，检测完毕");
	}
}
