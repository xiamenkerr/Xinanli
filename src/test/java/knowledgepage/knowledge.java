package knowledgepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import Lib.hangyeyanjiu;
import Lib.zhishiku;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class knowledge {
	public void run_knowledge(WebDriver driver) throws InterruptedException {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		//进入知识库
		
		spy.target_xpath(zhishiku.zsk_click).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		ff.swich(currentWin, driver);
		wating.waitForElementIsEnable(zhishiku.fenlei_click);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		spy.target_xpath(zhishiku.fenlei_click).click();
		
		wating.waitForElementIsEnable(zhishiku.xiangmu_click);
		spy.target_xpath(zhishiku.xiangmu_click).click();
		
		wating.waitForElementIsEnable(zhishiku.jingpin_click);
		spy.target_xpath(zhishiku.jingpin_click).click();
		
		wating.waitForElementIsEnable(zhishiku.shiti_click);
		spy.target_xpath(zhishiku.shiti_click).click();
		
		wating.waitForElementIsEnable(zhishiku.safe_click);
		spy.target_xpath(zhishiku.safe_click).click();
		
		wating.waitForElementIsEnable(zhishiku.daka_click);
		spy.target_xpath(zhishiku.daka_click).click();
		
		wating.waitForElementIsEnable(zhishiku.tuiguang_click);
		spy.target_xpath(zhishiku.tuiguang_click).click();
		
		wating.waitForElementIsEnable(zhishiku.geren_click);
		spy.target_xpath(zhishiku.geren_click).click();
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
	}
}
