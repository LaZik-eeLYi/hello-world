/**
 * @版权所有: 四川曙光集团   
 * @标题: FloatToRMB.java 
 * @包路径:  com.lupan.javaStudy.chapter4 
 * @描述: TODO
 * @作者: 卢攀  
 * @日期: 2015年8月31日 下午2:36:32
 * @version V1.0   
 */
package com.lupan.javaStudy.chapter4;

import java.text.DecimalFormat;

/**
 * TODO 把浮点数转化为人民币大写的读法
 *
 * @className FloatToRMB
 * @author lupan
 */
public class FloatToRMB {

	/**
	 * 字符转换
	 * @param f
	 * @return
	 */
	public static String exchange(double f ){
		//精确到小数点后两位
		double f1  =  Double.parseDouble(new DecimalFormat("#.00").format(f));
		//转为字符串
		String s = String.valueOf(f1);
		String[] sa = s.split("[.]");
		
		//拆分为整数、小数两个部分
		char[] intPart = sa[0].toCharArray();
		char[] decimalPart = sa[1].toCharArray();
		
		//整数部分转化
		
		String result = "";
		int length = intPart.length;
		for (int i = 0; i < intPart.length; i++) {
			String sb = "";
			//大写转化
			char c = intPart[i];
			switch (c) {
			case '0':
				if(i != length-1 && i != 0){
					switch ((length-i)%4) {
					case 0:
						
						break;
					case 1:
						if(intPart[i+1]!='0' && intPart[i-1]!='0'){
							sb  = "零";
						}
						break;
					case 2:
						if(intPart[i+1]!='0' && intPart[i-1]!='0'){
							sb  = "零";
						}
						break;
					case 3:
						if(intPart[i+1]!='0' && intPart[i-1]!='0'){
							sb  = "零";
						}
						break;

					default:
						break;
					}
				}
				
				break;
			case '1':
				 sb  = "壹";
				break;
			case '2':
				sb= "贰";
				break;
			case '3':
				sb= "叁";
				break;
			case '4':
				sb= "肆";
				break;
			case '5':
				sb= "伍";
				break;
			case '6':
				sb= "陆";
				break;
			case '7':
				sb= "柒";
				break;
			case '8':
				sb= "捌";
				break;
			case '9':
				sb= "玖";
				break;

			default:
				break;
			}
			
			//判断单位
			if(c != '0'){
				switch((length-i)%4){
				case 0 : 
					sb+="千";
					break;
				case 1 : 
					sb+="";
					break;
				case 2 : 
					sb+="拾";
					break;
				case 3 : 
					sb+="佰";
					break;
				}
			}

			
			//添加万和亿单位
			if(length -i == 1){
				sb += "圆";
			}else if(length -i == 5){
				sb += "万";
			}else if(length-i==9){
				sb += "亿";
			}
			
			result += sb;
		}
		
		//小数部分转化
		for(int i= 0 ;i<2 ; i++){
			//大写转化
			char c = decimalPart[i];
			String sb = "";
			switch (c) {
			case '0':
				sb  = "零";
				break;
			case '1':
				 sb  = "壹";
				break;
			case '2':
				sb= "贰";
				break;
			case '3':
				sb= "叁";
				break;
			case '4':
				sb= "肆";
				break;
			case '5':
				sb= "伍";
				break;
			case '6':
				sb= "陆";
				break;
			case '7':
				sb= "柒";
				break;
			case '8':
				sb= "捌";
				break;
			case '9':
				sb= "玖";
				break;

			default:
				break;
			}
			
			if(i==0){
				if(c=='0' && decimalPart[1]== '0'){
					break;
				}else if(c !='0'){
					sb += "角";
				}
			}
			
			if(i==1){
				if(c=='0'){
					break;
				}
				sb += "分";
			}
			
			result +=sb;
		}
		return result;
	}
	
	public static void main(String args[]){
		System.out.println(FloatToRMB.exchange(402010.0234));
	}
}
