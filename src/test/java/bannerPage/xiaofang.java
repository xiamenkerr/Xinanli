package bannerPage;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class xiaofang {
	public void run_xiaofang(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.消防安全评估
		Thread.sleep(400);
		touch.over(driver, banner.xiaofang_over);
		wating.waitForElementIsEnable(banner.pinggu_click);
		spy.target_xpath(banner.pinggu_click).click();
//		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.pinggu_check);
		assertEquals(spy.target_xpath(fuwu.pinggu_check).getText(), "消防安全评估","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//2.消防设施检测
		Thread.sleep(400);
		touch.over(driver, banner.xiaofang_over);
		wating.waitForElementIsEnable(banner.sheshi_click);
		spy.target_xpath(banner.sheshi_click).click();
//		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.jiance_check);
		assertEquals(spy.target_xpath(fuwu.jiance_check).getText(), "消防设施检测","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.消防设施维保
		Thread.sleep(400);
		touch.over(driver, banner.xiaofang_over);
		wating.waitForElementIsEnable(banner.weibao_click);
		spy.target_xpath(banner.weibao_click).click();
//		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.weibao_check);
		assertEquals(spy.target_xpath(fuwu.weibao_check).getText(), "消防设施维保","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//4.消防工程设计
		Thread.sleep(300);
		touch.over(driver, banner.xiaofang_over);
		wating.waitForElementIsEnable(banner.gongcheng_click);
		spy.target_xpath(banner.gongcheng_click).click();
//		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.sheji_check);
		assertEquals(spy.target_xpath(fuwu.sheji_check).getText(), "消防工程设计","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//5.消防安全培训
		Thread.sleep(300);
		touch.over(driver, banner.xiaofang_over);
		wating.waitForElementIsEnable(banner.peixun_click);
		spy.target_xpath(banner.peixun_click).click();
//		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.peixun_check);
		assertEquals(spy.target_xpath(fuwu.peixun_check).getText(), "消防安全培训","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//6.消防安全管理体系
		Thread.sleep(300);
		touch.over(driver, banner.xiaofang_over);
		wating.waitForElementIsEnable(banner.tixi_click);
		spy.target_xpath(banner.tixi_click).click();
//		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.tixi_check);
		assertEquals(spy.target_xpath(fuwu.tixi_check).getText(), "消防安全管理体系","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner消防安全服务共6个链接，检测完毕");
	}
}
