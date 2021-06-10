/**
 * @版权所有: 四川曙光集团   
 * @标题: PrintCircle.java 
 * @包路径:  com.lupan.javaStudy.traditional
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年8月31日 上午9:57:43
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter3;

import java.util.Scanner;

/**
 * TODO 在控制台打印一个圆，圆的大小随半径改变
 * 
 * 一个换行算成一个单位半径，一个空格也算成一个单位半径，
 * 这样通过Math类相关函数就能实现
 *
 * @className PrintCircle
 * @author lupan
 */
public class PrintCircle {
	public static void main(String args[]){
	    //接受半径输入
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		//精度（像圆的程度）
		final int PRECISION = scanner.nextInt();
		scanner.close();
		//循环计算打印点的坐标
		//上半圆
		for(int i=r;i>=0;i--){
			float n =(float) (r -  Math.sqrt(r*r-i*i));
			int space = Math.round(n);
			
			for(int j=0;j<space;j++){
				for (int k = 0; k < PRECISION; k++) {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			
			for(int j=0;j<(r-space)*2;j++){
				for (int k = 0; k < PRECISION; k++) {
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
		//下半圆
		for(int i=0;i<=r;i++){
			float n =(float) (r -  Math.sqrt(r*r-i*i));
			int space = Math.round(n);
			
			for(int j=0;j<space;j++){
				for (int k = 0; k < PRECISION; k++) {
					System.out.print(" ");
				}
			}
			System.out.print("*");
			
			for(int j=0;j<(r-space)*2;j++){
				for (int k = 0; k < PRECISION; k++) {
					System.out.print(" ");
				}
			}
			System.out.println("*");
		}
	}
}
