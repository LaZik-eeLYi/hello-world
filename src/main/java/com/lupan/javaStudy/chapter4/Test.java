/**
 * @版权所有: 四川曙光集团   
 * @标题: Test.java 
 * @包路径:  com.lupan.javaStudy.chapter4 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年8月31日 下午1:41:09
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * TODO
 *
 * @className Test
 * @author lupan
 */
public class Test {

	public static void main(String args[]) {

		/************************ 循环控制 ***************************/
//		outer: for (int i = 0; i < 3; i++) {
//			System.out.println("外：" + i);
//
//			for (int j = 0; j < 5; j++) {
//				System.out.println("内：" + j);
//				if (j == 3) {
//					break outer;
//				}
//			}
//		}

//		 for (int i = 0; i < 3; i++) {
//			System.out.println("外：" + i);
//
//			outer: for (int j = 0; j < 5; j++) {
//				if (j == 2) {
//					continue outer;
//				}
//				System.out.println("内：" + j);
//			}
//		}
		 
		 /**********************数组***********************/
		 int[] array = new int[]{3,4,1,2};
		 int[] array1 = {1,2,3,4};
		 for(int n : array){
			 System.out.print(n+",");
		 }
		 System.out.print("\n");
		 Arrays.sort(array);
		 for(int n : array){
			 System.out.print(n+",");
		 }

       	/******************************************************************/

	}
}


