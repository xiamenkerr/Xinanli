package bannerPage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class baoxian {
	public void run_baoxian(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.安全生产责任险
		Thread.sleep(500);
		touch.over(driver, banner.baoxian_over);
		wating.waitForElementIsEnable(banner.shengchan_click);
		spy.target_xpath(banner.shengchan_click).click();
//		Thread.sleep(100);
		wating.waitForElementIsEnable(fuwu.anquanzeren_check);
		assertEquals(spy.target_xpath(fuwu.anquanzeren_check).getText(), "安全生产责任险","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//2.环境污染责任险
		Thread.sleep(500);
		touch.over(driver, banner.baoxian_over);
		wating.waitForElementIsEnable(banner.wuran_click);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		spy.target_xpath(banner.wuran_click).click();
//		Thread.sleep(100);
		wating.waitForElementIsEnable(fuwu.huanjing_check);
		assertEquals(spy.target_xpath(fuwu.huanjing_check).getText(), "环境污染责任险","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.企业财产险
		Thread.sleep(500);
		touch.over(driver, banner.baoxian_over);
		wating.waitForElementIsEnable(banner.caichan_click);
		spy.target_xpath(banner.caichan_click).click();
//		Thread.sleep(100);
		wating.waitForElementIsEnable(fuwu.caichan_check);
		assertEquals(spy.target_xpath(fuwu.caichan_check).getText(), "企业财产险","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner保险代理服务共3个链接，检测完毕");
	}
}
