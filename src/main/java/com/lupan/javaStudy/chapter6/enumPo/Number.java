/**
 * @版权所有: 四川曙光集团   
 * @标题: Number.java 
 * @包路径:  com.lupan.javaStudy.chapter6.enumPo 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年9月21日 上午10:16:29
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter6.enumPo;

/**
 * TODO 牌面数字
 *
 * @className Number
 * @author lupan
 */
public enum Number {

	A(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),J(11),Q(12),K(13),JOKER(0);
	
	private int num;
	
	private Number(int num){
		this.num = num;
	}
	
	public int getNum(){
		return this.num;
	}
}
