/**
 * @版权所有: 四川曙光集团   
 * @标题: I18n.java 
 * @包路径:  com.lupan.javaStudy.chapter9 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年10月10日 上午10:15:48
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter9;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * TODO
 *
 * @className I18n
 * @author lupan
 */
public class I18n {
	public static void main(String[] args){
		 //取得系统默认国家语言环境
		Locale myLocale = Locale.getDefault();
		
		System.out.println(myLocale.getLanguage()+"_"+myLocale.getCountry());
		//根据国家语言环境加载资源文件
		ResourceBundle bundle  = ResourceBundle.getBundle("com.lupan.javaStudy.chapter9.resource.mess",myLocale);
		
	    //打印取得的消息
		System.out.println(bundle.getString("hello"));
	}
}
