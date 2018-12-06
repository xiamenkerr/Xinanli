package Lib;

public interface hangyequan {
	String hyq="//span[@class='tit'and contains(text(),'行业圈')]";
	
	String dongtai_click="//a[@target='_self'and contains(text(),'动态')]";
	String dongtai_check="//div[@class='left_menu']/ul/li[1]";	//全部动态
	
	String boke_click="//a[@target='_self'and contains(text(),'博客')]";
	String boke_check=".//*[@id='news-release']/span";		//发博客
	
	String wenda_click="//a[@target='_self'and contains(text(),'问答')]";
	String wenda_check="//div[@class='title' and text()='问答达人排行']";
	
	String findhb_click="//a[@target='_self'and contains(text(),'找伙伴')]";
	String findhb_check="//div[@class='user_container']/ul/li[1]/a/span[text()='热门']";
}
