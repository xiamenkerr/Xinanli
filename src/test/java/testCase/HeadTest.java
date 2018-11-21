package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import bannerPage.anquan;
import bannerPage.baoxian;
import bannerPage.fengxian;
import bannerPage.huanbao;
import bannerPage.jiaoyu;
import bannerPage.xiaofang;
import bannerPage.zhiye;
import basePage.TurnOn_driver;
import gongjuPage.Gongju_link;
import hangyepage.hangyequan;
import knowledgepage.knowledge;
import severPage.Anquan_ziXun;
import severPage.Zhiye_weisheng;
import severPage.baoxian_daili;
import severPage.fengxian_guankong;
import severPage.huanbao_zixun;
import severPage.jiaoyu_peixun;
import severPage.xiaofang_anquan;
import xinmorePage.xinweike;
import yanjiupage.hangye;

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
		baoxian_daili baoxian_page=new baoxian_daili();
		fengxian_guankong fengxian_page= new fengxian_guankong();
		jiaoyu_peixun jiaoyu_page=new jiaoyu_peixun();
		hangyequan hangye_page=new hangyequan();
		hangye yanjiu_page= new hangye();
		knowledge knowledge_page=new knowledge();
		xinweike xinweike_page=new xinweike();
		anquan anquan_page=new anquan();
		zhiye zhiye_page=new zhiye();
		huanbao huanbao_page=new huanbao();
		xiaofang xiaofang2_page=new xiaofang();
		baoxian baoxian2_page=new baoxian();
		fengxian fengxian_page2=new fengxian();
		jiaoyu jiaoyu_page2=new jiaoyu();
		
		drivers=browser.setupFirfox();
		Gong_page.link_check(drivers);          //工具页测试
		anquanzixun_page.anquanzixun(drivers);  //安全咨询服务
		zhiyeweisheng_page.runzhiye(drivers);   //职业卫生咨询服务
		huanbaozixuan_page.run_huanbao(drivers);//环保咨询服务
		xiaofang_page.run_xiaofang(drivers);    //消防安全服务
		baoxian_page.run_baoxian(drivers); 		//保险代理服务
		fengxian_page.run_fengxian(drivers);	//风险管控服务
		jiaoyu_page.run_jiaoyu(drivers); 		//教育培训
//		
		hangye_page.run_hangye(drivers);		//行业圈
		yanjiu_page.run_hangyeyanjiu(drivers);	//行业研究
		knowledge_page.run_knowledge(drivers);	//知识库
		xinweike_page.run_xinweike(drivers); 	//鑫微客+更多
		anquan_page.run_anquan(drivers); 		//banner安全咨询服务
		zhiye_page.run_zhiye(drivers); 			//banner职业卫生咨询服务
		huanbao_page.run_huanbao(drivers); 		//banner环保咨询服务
		xiaofang2_page.run_xiaofang(drivers); 	//banner消防安全服务
		baoxian2_page.run_baoxian(drivers); 	//banner保险代理服务
		fengxian_page2.run_fengxian(drivers); 	//banner风险管控服务
		jiaoyu_page2.run_jiaoyu(drivers); 		//banner教育培训	
		
		
		
//预留工作区............................................................................!!!!!!!!!!!!		
		browser.teardownBrowser();
	}	
}
