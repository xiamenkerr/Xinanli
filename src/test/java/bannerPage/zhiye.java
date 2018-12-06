package bannerPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class zhiye {
	public void run_zhiye(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.职业病危害预评价
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.weihai_click);
		spy.target_xpath(banner.weihai_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weihaiyu_check);
		assertEquals(spy.target_xpath(fuwu.weihaiyu_check).getText(), "职业病危害预评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//2.职业病危害控制效果评价
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.kongzhi_click);
		spy.target_xpath(banner.kongzhi_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weihaikongzhi_check);
		assertEquals(spy.target_xpath(fuwu.weihaikongzhi_check).getText(), "职业病危害控制效果评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.职业病危害现状评价
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.zhiye_click);
		spy.target_xpath(banner.zhiye_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weihaixianzhuang_check);
		assertEquals(spy.target_xpath(fuwu.weihaixianzhuang_check).getText(), "职业病危害现状评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//4.职业病危害因素检测
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.yinsu_click);
		spy.target_xpath(banner.yinsu_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weihaiyinsu_check);
		assertEquals(spy.target_xpath(fuwu.weihaiyinsu_check).getText(), "职业病危害因素检测","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//5.放射卫生检测评价
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.fangshe_click);
		spy.target_xpath(banner.fangshe_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weishengjiance_check);
		assertEquals(spy.target_xpath(fuwu.weishengjiance_check).getText(), "放射卫生检测评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//6.职业病危害因素委托检测
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.weituo_click);
		spy.target_xpath(banner.weituo_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weituo_check);
		assertEquals(spy.target_xpath(fuwu.weituo_check).getText(), "职业病危害因素委托检测","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//7.职业病防护设施设计专篇
		Thread.sleep(500);
		touch.over(driver, banner.zhiye_over);
		wating.waitForElementIsEnable(banner.zhuanpian_click);
		spy.target_xpath(banner.zhuanpian_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.fanghusheji_check);
		assertEquals(spy.target_xpath(fuwu.fanghusheji_check).getText(), "职业病防护设施设计专篇","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner职业卫生咨询服务共7个链接，检测完毕");
	}
}
