/**
 * @版权所有: 四川曙光集团   
 * @标题: StringCut.java 
 * @包路径:  com.lupan.javaStudy.chapter4 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年8月31日 下午2:18:50
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter4;

/**
 * TODO 字符串截取函数实现
 *
 * @className StringCut
 * @author lupan
 */
public class StringCut {

	/**
	 * 截取字符串的方法，start从0开始
	 * @param s
	 * @param start
	 * @param end
	 * @return
	 */
	public static String cut(String s,int start,int end){
		char[] chars = s.toCharArray();
		char[] newChars = new char[end-start+1];
		for (int i = 0; i < newChars.length; i++) {
			newChars[i] = chars[i+start];
		}
		return String.valueOf(newChars);
	}
	
	public static void main(String args[]){
		System.out.println(StringCut.cut("abcdefg", 1, 6));
	}
}
