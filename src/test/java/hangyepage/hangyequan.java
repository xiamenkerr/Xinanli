package hangyepage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class hangyequan {
	public void run_hangye(WebDriver driver) throws InterruptedException {
		
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		//进入行业圈
		spy.target_xpath(Lib.hangyequan.hyq).click();
//		Thread.sleep(1000);
		
		ff.swich(currentWin, driver);
		//动态
		wating.waitForElementIsEnable(Lib.hangyequan.dongtai_click);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		spy.target_xpath(Lib.hangyequan.dongtai_click).click();
		wating.waitForElementIsEnable(Lib.hangyequan.dongtai_check);
		assertEquals(spy.target_xpath(Lib.hangyequan.dongtai_check).getText(), "全部动态","实际与期望不一致");
		//博客
		wating.waitForElementIsEnable(Lib.hangyequan.boke_click);
		spy.target_xpath(Lib.hangyequan.boke_click).click();
		wating.waitForElementIsEnable(Lib.hangyequan.boke_check);
		assertEquals(spy.target_xpath(Lib.hangyequan.boke_check).getText(), "发博客","实际与期望不一致");
		//问答
		wating.waitForElementIsEnable(Lib.hangyequan.wenda_click);
		spy.target_xpath(Lib.hangyequan.wenda_click).click();
		wating.waitForElementIsEnable(Lib.hangyequan.wenda_check);
		assertEquals(spy.target_xpath(Lib.hangyequan.wenda_check).getText(), "问答达人排行","实际与期望不一致");
		//找伙伴
		wating.waitForElementIsEnable(Lib.hangyequan.findhb_click);
		spy.target_xpath(Lib.hangyequan.findhb_click).click();
		wating.waitForElementIsEnable(Lib.hangyequan.findhb_check);
		assertEquals(spy.target_xpath(Lib.hangyequan.findhb_check).getText(), "热门","实际与期望不一致");
		
		//关闭当前窗口
		driver.close();	
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
	}
}
