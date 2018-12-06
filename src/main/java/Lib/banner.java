package Lib;

public interface banner {
	//1.安全咨询服务
	String anquan_over="//p[@class='banner-nav-list-title'and text()='安全咨询服务']";
	String yuping_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'安全预评价')]";
	String yanshou_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'安全验收评价')]";
	String xianzhuang_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'安全现状评价')]";
	String biaozhun_click="//ul[@class='clearfix']/li[4]/a[contains(text(),'安全生产标准化')]";
	String bianshi_click="//ul[@class='clearfix']/li[5]/a[contains(text(),'重大危险源辨识与评估')]";
	String guanli_click="//ul[@class='clearfix']/li[6]/a[contains(text(),'安全管理培训')]";
	String yinhuan_click="//ul[@class='clearfix']/li[7]/a[contains(text(),'安全隐患排查')]";
	String sheji_click="//ul[@class='clearfix']/li[8]/a[contains(text(),'安全设施设计专篇')]";
	String tuoguan_click="//ul[@class='clearfix']/li[9]/a[contains(text(),'安全托管')]";
	//2.职业卫生咨询服务
	String zhiye_over="//p[@class='banner-nav-list-title'and text()='职业卫生咨询服务']";
	String  weihai_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'职业病危害预评价')]";
	String  kongzhi_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'职业病危害控制效果评价')]";
	String  zhiye_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'职业病危害现状评价')]";
	String  yinsu_click="//ul[@class='clearfix']/li[4]/a[contains(text(),'职业病危害因素检测')]";
	String  fangshe_click="//ul[@class='clearfix']/li[5]/a[contains(text(),'放射卫生检测评价')]";
	String  weituo_click="//ul[@class='clearfix']/li[6]/a[contains(text(),'职业病危害因素委托检测')]";
	String  zhuanpian_click="//ul[@class='clearfix']/li[7]/a[contains(text(),'职业病防护设施设计专篇')]";	
	//3.环保咨询服务
	String huanbao_over="//p[@class='banner-nav-list-title'and text()='环保咨询服务']";
	String  xiangmu_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'建设项目环境影响评价')]";
	String  guihua_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'规划环境影响评价')]";
	String  jiance_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'环境监测')]";
	String  tufa_click="//ul[@class='clearfix']/li[4]/a[contains(text(),'企业突发环境事件应急预案')]";
	String  jungong_click="//ul[@class='clearfix']/li[5]/a[contains(text(),'建设项目竣工环境保护验收')]";
	String  baohu_click="//ul[@class='clearfix']/li[6]/a[contains(text(),'环境保护工程设计')]";
	String  paiwu_click="//ul[@class='clearfix']/li[7]/a[contains(text(),'新版排污许可证咨询')]";
	String  huanbao_click="//ul[@class='clearfix']/li[8]/a[contains(text(),'环保税咨询')]";
	//4.消防安全服务
//	"//ul[@class='clearfix']/li[6]/a[contains(text(),'消防安全管理体系')]";
	String xiaofang_over="//p[@class='banner-nav-list-title'and text()='消防安全服务']";
	String  pinggu_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'消防安全评估')]";
	String  sheshi_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'消防设施检测')]";
	String  weibao_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'消防设施维保')]";
	String  gongcheng_click="//ul[@class='clearfix']/li[4]/a[contains(text(),'消防工程设计')]";
	String  peixun_click="//ul[@class='clearfix']/li[5]/a[contains(text(),'消防安全培训')]";
	String  tixi_click="//ul[@class='clearfix']/li[6]/a[contains(text(),'消防安全管理体系')]";
	//5.保险代理服务
	String baoxian_over="//p[@class='banner-nav-list-title'and text()='保险代理服务']";
	String  shengchan_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'安全生产责任险')]";
	String  wuran_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'环境污染责任险')]";
	String  caichan_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'企业财产险')]";
	
	//6.风险管控服务
	String fengxian_over="//p[@class='banner-nav-list-title'and text()='风险管控服务']";
	String  yuan_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'环境应急预案')]";
	String  paicha_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'环境风险安全隐患排查')]";
	String  fengxian_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'环境风险评估')]";
	String  qiye_click="//ul[@class='clearfix']/li[4]/a[contains(text(),'企业财产保险风险评估')]";
	String  baoxian_click="//ul[@class='clearfix']/li[5]/a[contains(text(),'安全生产责任保险风险评估')]";
	String  jisuan_click="//ul[@class='clearfix']/li[6]/a[contains(text(),'安全生产责任保险保费计算')]";
	String  weixian_click="//ul[@class='clearfix']/li[7]/a[contains(text(),'危险有害因素辨识')]";
	String  weixianyuan_click="//ul[@class='clearfix']/li[8]/a[contains(text(),'危险源辨识')]";
	String  shigu_click="//ul[@class='clearfix']/li[9]/a[contains(text(),'生产安全事故隐患排查')]";
	String  biaozhunhua_click="//ul[@class='clearfix']/li[10]/a[contains(text(),'安全生产标准化咨询')]";
	String  pingshen_click="//ul[@class='clearfix']/li[11]/a[contains(text(),'安全生产标准化评审')]";
	String  bianzhi_click="//ul[@class='clearfix']/li[12]/a[contains(text(),'生产安全事故应急预案编制')]";
	String  pingjia_click="//ul[@class='clearfix']/li[13]/a[contains(text(),'安全评价')]";
	//7.教育培训
	String jiaoyu_over="//p[@class='banner-nav-list-title'and text()='教育培训']";
	String  xiaofang_click="//ul[@class='clearfix']/li[1]/a[contains(text(),'消防安全培训')]";
	String  huanjing_click="//ul[@class='clearfix']/li[2]/a[contains(text(),'环境安全培训')]";
	String  dianqi_click="//ul[@class='clearfix']/li[3]/a[contains(text(),'电气安全培训')]";
	String  jiaoyu_click="//ul[@class='clearfix']/li[4]/a[contains(text(),'安全生产教育培训')]";
	String  fangzhi_click="//ul[@class='clearfix']/li[5]/a[contains(text(),'职业病防治教育培训')]";
	String  zhuanshi_click="//ul[@class='clearfix']/li[6]/a[contains(text(),'注安师考试培训')]";
	
}
