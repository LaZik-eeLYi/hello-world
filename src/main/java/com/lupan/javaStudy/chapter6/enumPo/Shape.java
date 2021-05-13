/**
 * @版权所有: 四川曙光集团   
 * @标题: Shape.java 
 * @包路径:  com.lupan.javaStudy.chapter6.enumPo 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年9月21日 上午10:03:21
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter6.enumPo;

/**
 * TODO 扑克牌形状
 *
 * @className Shape
 * @author lupan
 */
public enum Shape {

	SPADE("黑桃"),HEART("红心"),CLUB("梅花"),DIAMOND("方片");
	
	private String name ;
	private Shape( String name){
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
