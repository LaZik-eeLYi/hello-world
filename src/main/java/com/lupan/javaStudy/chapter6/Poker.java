/**
 * @版权所有: 四川曙光集团   
 * @标题: Poker.java 
 * @包路径:  com.lupan.javaStudy.chapter6 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年9月21日 上午10:01:17
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter6;

import com.lupan.javaStudy.chapter6.enumPo.Shape;
import com.lupan.javaStudy.chapter6.enumPo.Number;

/**
 * TODO 扑克牌类
 *
 * @className Poker
 * @author lupan
 */
public class Poker {

	//牌面号
	private Number number;
	//形状
	private Shape shape;
	
	/**
	 * @return the number
	 */
	public Number getNumber() {
		return number;
	}
	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(Number number) {
		this.number = number;
	}
	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
}
