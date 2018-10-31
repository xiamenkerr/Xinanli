package gongjuPage;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Lib.gongju;
import tools.Wait;
import tools.find;

public class Gongju_link {
	
	public void link_check(WebDriver driver) throws InterruptedException {
		Wait wating=new Wait(driver);
		find spy=new find(driver);
		//获取当前窗口的句柄
		String currentWin = driver.getWindowHandle();
		//点击跳转产品工具页面
		spy.target_xpath(gongju.gj).click();
//		driver.findElement(By.xpath(gongju.gj)).click();
		//获取所有窗口的句柄
		java.util.Set<String> handles=driver.getWindowHandles(); 
		for(String i : handles) {	
			if (i.equals(currentWin)==false){
				driver.switchTo().window(i);//切换到第二个窗口的句柄
				wating.waitForElementIsEnable(gongju.Pdgj);
				WebElement obj=spy.target_xpath(gongju.Pdgj);
				assertEquals(obj.getText(), "产品工具", "实际与期望不一致");
				//关闭当前窗口
				driver.close();			 	
				}	
			}
		//切换回之前窗口的句柄
		driver.switchTo().window(currentWin);
	}
}
