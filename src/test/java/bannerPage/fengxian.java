package bannerPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Lib.banner;
import Lib.fuwu;
import tools.MouseOver;
import tools.Wait;
import tools.find;

public class fengxian {
	public void run_fengxian(WebDriver driver ) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		
		//1.环境应急预案
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.yuan_click);
		spy.target_xpath(banner.yuan_click).click();
		wating.waitForElementIsEnable(fuwu.yuan_check);
		assertEquals(spy.target_xpath(fuwu.yuan_check).getText(), "环境应急预案","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//2.环境风险安全隐患排查
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.paicha_click);
		spy.target_xpath(banner.paicha_click).click();
		wating.waitForElementIsEnable(fuwu.yinhuanpaicha_check);
		assertEquals(spy.target_xpath(fuwu.yinhuanpaicha_check).getText(), "环境风险安全隐患排查","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//3.环境风险评估
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.fengxian_click);
		spy.target_xpath(banner.fengxian_click).click();
		wating.waitForElementIsEnable(fuwu.fengxianpinggu_check);
		assertEquals(spy.target_xpath(fuwu.fengxianpinggu_check).getText(), "环境风险评估","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//4.企业财产保险风险评估
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.qiye_click);
		spy.target_xpath(banner.qiye_click).click();
		wating.waitForElementIsEnable(fuwu.qiyecaichan_check);
		assertEquals(spy.target_xpath(fuwu.qiyecaichan_check).getText(), "企业财产保险风险评估","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//5.安全生产责任保险风险评估
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.baoxian_click);
		spy.target_xpath(banner.baoxian_click).click();
		wating.waitForElementIsEnable(fuwu.shengchanzeren_check);
		assertEquals(spy.target_xpath(fuwu.shengchanzeren_check).getText(), "安全生产责任保险风险评估","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//6.安全生产责任保险保费计算
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.jisuan_click);
		spy.target_xpath(banner.jisuan_click).click();
		wating.waitForElementIsEnable(fuwu.baofeijisuan_check);
		assertEquals(spy.target_xpath(fuwu.baofeijisuan_check).getText(), "安全生产责任保险保费计算","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//7.危险有害因素辨识
		try {
			Thread.sleep(1500);
			wating.waitForElementIsEnable(banner.fengxian_over);
			touch.over(driver, banner.fengxian_over);
			wating.waitForElementIsEnable(banner.weixian_click);
			spy.target_xpath(banner.weixian_click).click();
			wating.waitForElementIsEnable(fuwu.weixian_check);
			assertEquals(spy.target_xpath(fuwu.weixian_check).getText(), "危险有害因素辨识","实际与期望不一致");
			//浏览器回退之前页面
			driver.navigate().back();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出错了");
			driver.navigate().refresh();
			Thread.sleep(3000);
		}
		//8.危险源辨识
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.weixianyuan_click);
		spy.target_xpath(banner.weixianyuan_click).click();
		wating.waitForElementIsEnable(fuwu.weixianyuan_check);
		assertEquals(spy.target_xpath(fuwu.weixianyuan_check).getText(), "危险源辨识","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//9.生产安全事故隐患排查
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.shigu_click);
		spy.target_xpath(banner.shigu_click).click();
		wating.waitForElementIsEnable(fuwu.shiguyinhuan_check);
		assertEquals(spy.target_xpath(fuwu.shiguyinhuan_check).getText(), "生产安全事故隐患排查","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//10.安全生产标准化咨询
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.biaozhunhua_click);
		spy.target_xpath(banner.biaozhunhua_click).click();
		wating.waitForElementIsEnable(fuwu.biaozhunhua_check);
		assertEquals(spy.target_xpath(fuwu.biaozhunhua_check).getText(), "安全生产标准化咨询","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//11.安全生产标准化评审
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.pingshen_click);
		spy.target_xpath(banner.pingshen_click).click();
		wating.waitForElementIsEnable(fuwu.pingshen_check);
		assertEquals(spy.target_xpath(fuwu.pingshen_check).getText(), "安全生产标准化评审","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//12.生产安全事故应急预案编制
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.bianzhi_click);
		spy.target_xpath(banner.bianzhi_click).click();
		wating.waitForElementIsEnable(fuwu.bianzhi_check);
		assertEquals(spy.target_xpath(fuwu.bianzhi_check).getText(), "生产安全事故应急预案编制","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//13.安全评价
		Thread.sleep(500);
		wating.waitForElementIsEnable(banner.fengxian_over);
		touch.over(driver, banner.fengxian_over);
		wating.waitForElementIsEnable(banner.pingjia_click);
		spy.target_xpath(banner.pingjia_click).click();
		wating.waitForElementIsEnable(fuwu.pingjia_check);
		assertEquals(spy.target_xpath(fuwu.pingjia_check).getText(), "安全评价","实际与期望不一致");
		//浏览器回退之前页面
		driver.navigate().back();
		
		//打印执行结果
		System.out.println("banner风险管控服务共13个链接，检测完毕");
	}
}
