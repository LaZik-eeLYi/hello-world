/**
 * @版权所有: 四川曙光集团   
 * @标题: MyException.java 
 * @包路径:  com.lupan.javaStudy.chapter10 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年10月16日 下午3:29:22
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter10;

/**
 * TODO 自定义一个异常
 *
 * @className MyException
 * @author lupan
 */
public class MyException extends RuntimeException {

	public MyException(String msg) {
		super(msg);
	}

}
