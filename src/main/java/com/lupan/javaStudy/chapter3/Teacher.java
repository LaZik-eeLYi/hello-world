/**
 * @版权所有: 四川曙光集团   
 * @标题: Teacher.java 
 * @包路径:  com.lupan.javaStudy.traditional
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年8月27日 下午5:19:18
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter3;

/**
 * TODO 教师类
 *
 * @className Teacher
 * @author lupan
 */
public class Teacher {

	//姓名
	private String name;
	//工号
	private String num;
	
	/**
	 * 获取老师的信息
	 * @param name
	 * @param num
	 * @return
	 */
	public String getName(String name, String num){
		return "名字"+name+"工号"+num;
	}
}
