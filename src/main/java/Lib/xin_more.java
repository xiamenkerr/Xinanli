package Lib;

public interface xin_more {
	String xwk="//span[@class='tit' and text()='鑫微客']";
	
	String fuzx_click="//div[@class='vekenav']/ul/li/a[text()='服务中心']";
	String fuzx_check="//h3[@class='title-sigleft' and text()='服务中心']";
	
	String more_over="//span[@class='tit' and text()='更多']";
	
//	String falv_click="//span[@class='sub-links-txt1' and text()='法律法规检索']";		//报错的原因就是XPath找的目标元素不对，无法施加click方法
	String falv_click="//ul[@class='sub-links-ul']/li/a[@class=''and @title='法律法规检索']";
	String falv_check="//span[@class='select_txt'and text()='全部']";
	
	String ehs_click="//span[@class='sub-links-txt1' and text()='智慧EHS']";
	String ehs_check="//ul[@class='nav']/li/a[text()='产品页']";
	
	String tongan_click="//span[@class='sub-links-txt1 green' and text()='同安风控']";
	String tongan_check="//a[@class='mffbxq'and text()='免费发布需求']";
	
	String shouye_click="//span[@class='sub-links-txt1' and text()='双重预控系统']";
	String shouye_check="//ul[@class='nav']/li/a[text()='首页']";
	
	String paiwu_click="//span[@class='sub-links-txt1' and text()='排污许可证']";
	String paiwu_check="//div[@class='navwtg']/ul/li/a[text()='产品介绍']";
	
	String shui_click="//span[@class='sub-links-txt1' and text()='环保税计算']";
	String shui_check="//ul[@id='navbar-index']/li/a[text()='返回安环家']";
}
