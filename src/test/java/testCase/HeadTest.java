package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePage.TurnOn_driver;
import gongjuPage.Gongju_link;
import severPage.Anquan_ziXun;
import severPage.Zhiye_weisheng;
import severPage.huanbao_zixun;
import severPage.xiaofang_anquan;

public class HeadTest {

	@Test
	public static void main() throws Exception {
//	public static void main(String[] args) throws Exception {
		
		WebDriver drivers;
		TurnOn_driver browser=new TurnOn_driver();
		Gongju_link Gong_page=new Gongju_link();
		Anquan_ziXun anquanzixun_page=new Anquan_ziXun();
		Zhiye_weisheng zhiyeweisheng_page=new Zhiye_weisheng();
		huanbao_zixun huanbaozixuan_page=new huanbao_zixun();
		xiaofang_anquan xiaofang_page=new xiaofang_anquan();
		
		drivers=browser.setupFirfox();
//		Gong_page.link_check(drivers);          //工具页测试
//		anquanzixun_page.anquanzixun(drivers);  //安全咨询服务
//		zhiyeweisheng_page.runzhiye(drivers);   //职业卫生咨询服务
//		huanbaozixuan_page.run_huanbao(drivers);//环保咨询服务
		xiaofang_page.run_xiaofang(drivers);    //消防安全服务
		
		

//预留工作区............................................................................!!!!!!!!!!!!		
		
		
		
		
		browser.teardownBrowser();
	}	
}
