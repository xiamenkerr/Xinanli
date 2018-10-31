package basePage;

import org.openqa.selenium.WebDriver;

import tools.MouseOver;
import tools.SwichWin;
import tools.Wait;
import tools.find;

public class get_ready {

	public void ready(WebDriver driver) {
		find spy=new find(driver);
		Wait wating=new Wait(driver);
		MouseOver touch=new MouseOver();
		SwichWin ff=new SwichWin();
		String currentWin = driver.getWindowHandle();
		
		//功能还未实现
	}
}
