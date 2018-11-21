package bannerPage;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class huanbao {
	public void run_huanbao(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.建设项目环境影响评价
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.xiangmu_click);
		spy.target_xpath(banner.xiangmu_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.jianshexiangm_check);
		assertEquals(spy.target_xpath(fuwu.jianshexiangm_check).getText(), "建设项目环境影响评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();

		//2.规划环境影响评价
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.guihua_click);
		spy.target_xpath(banner.guihua_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.guihua_check);
		assertEquals(spy.target_xpath(fuwu.guihua_check).getText(), "规划环境影响评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.环境监测
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.jiance_click);
		spy.target_xpath(banner.jiance_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.huanjingjiance_check);
		assertEquals(spy.target_xpath(fuwu.huanjingjiance_check).getText(), "环境监测","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//4.企业突发环境事件应急预案
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.tufa_click);
		spy.target_xpath(banner.tufa_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.yingjiyuan_check);
		assertEquals(spy.target_xpath(fuwu.yingjiyuan_check).getText(), "企业突发环境事件应急预案","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//5.建设项目竣工环境保护验收
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.jungong_click);
		spy.target_xpath(banner.jungong_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.baohuyanshou_check);
		assertEquals(spy.target_xpath(fuwu.baohuyanshou_check).getText(), "建设项目竣工环境保护验收","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//6.环境保护工程设计
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.baohu_click);
		spy.target_xpath(banner.baohu_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.gongchengsheji_check);
		assertEquals(spy.target_xpath(fuwu.gongchengsheji_check).getText(), "环境保护工程设计","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//7.新版排污许可证咨询
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.paiwu_click);
		spy.target_xpath(banner.paiwu_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.zixun_check);
		assertEquals(spy.target_xpath(fuwu.zixun_check).getText(), "新版排污许可证咨询","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//8.环保税咨询
		Thread.sleep(400);
		touch.over(driver, banner.huanbao_over);
		wating.waitForElementIsEnable(banner.huanbao_click);
		spy.target_xpath(banner.huanbao_click).click();
		Thread.sleep(500);
		wating.waitForElementIsEnable(fuwu.huanbaoshui_check);
		assertEquals(spy.target_xpath(fuwu.huanbaoshui_check).getText(), "环保税咨询","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner环保咨询服务共8个链接，检测完毕");
	}
}
