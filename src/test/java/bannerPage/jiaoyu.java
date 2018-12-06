package bannerPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class jiaoyu {
	public void run_jiaoyu(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.消防安全培训
		Thread.sleep(500);
		touch.over(driver, banner.jiaoyu_over);
		wating.waitForElementIsEnable(banner.xiaofang_click);
		spy.target_xpath(banner.xiaofang_click).click();
		wating.waitForElementIsEnable(fuwu.xiaofang_check);
		assertEquals(spy.target_xpath(fuwu.xiaofang_check).getText(), "消防安全培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//2.环境安全培训
		Thread.sleep(500);
		touch.over(driver, banner.jiaoyu_over);
		wating.waitForElementIsEnable(banner.huanjing_click);
		spy.target_xpath(banner.huanjing_click).click();
		wating.waitForElementIsEnable(fuwu.huanjingpeixun_check);
		assertEquals(spy.target_xpath(fuwu.huanjingpeixun_check).getText(), "环境安全培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.电气安全培训
		Thread.sleep(500);
		touch.over(driver, banner.jiaoyu_over);
		wating.waitForElementIsEnable(banner.dianqi_click);
		spy.target_xpath(banner.dianqi_click).click();
		wating.waitForElementIsEnable(fuwu.dianqi_check);
		assertEquals(spy.target_xpath(fuwu.dianqi_check).getText(), "电气安全培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//4.安全生产教育培训
		Thread.sleep(500);
		touch.over(driver, banner.jiaoyu_over);
		wating.waitForElementIsEnable(banner.jiaoyu_click);
		spy.target_xpath(banner.jiaoyu_click).click();
		wating.waitForElementIsEnable(fuwu.jiaoyu_check);
		assertEquals(spy.target_xpath(fuwu.jiaoyu_check).getText(), "安全生产教育培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//5.职业病防治教育培训
		Thread.sleep(500);
		touch.over(driver, banner.jiaoyu_over);
		wating.waitForElementIsEnable(banner.fangzhi_click);
		spy.target_xpath(banner.fangzhi_click).click();
		wating.waitForElementIsEnable(fuwu.zhiyebing_check);
		assertEquals(spy.target_xpath(fuwu.zhiyebing_check).getText(), "职业病防治教育培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//6.注安师考试培训
		Thread.sleep(500);
		touch.over(driver, banner.jiaoyu_over);
		wating.waitForElementIsEnable(banner.zhuanshi_click);
		spy.target_xpath(banner.zhuanshi_click).click();
		wating.waitForElementIsEnable(fuwu.zhuanshi_check);
		assertEquals(spy.target_xpath(fuwu.zhuanshi_check).getText(), "注安师考试培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner教育培训共6个链接，检测完毕");
	}
}
