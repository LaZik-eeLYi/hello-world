package com.lupan.javaStudy;

import java.util.*;
import static java.lang.System.out;

public class Test{
    public static void main(String[] args) {

//        华为编程题
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            //余下的瓶子
//            int remian = n;
//            //喝了的汽水数
//            int sum = 0;
//            while (remian >= 3) {
//                sum += remian / 3;
//                remian = remian % 3 + remian / 3;
//            }
//
//            //最后是否能向老板借
//            if (remian >= 2) {
//                sum++;
//            }
//            //输出
//            System.out.println(sum);
//        }

//        小数相加结果不对
//        double one = 1.0;
//        double sum = 0.0;
//
//        for (int i = 0; i < 10; i++) {
//            sum+=0.1;
//            System.out.println(sum);
//        }


//        相差太大的浮点数相加出现差错
        double big = 1000000.00;
        double small = 0.0000001;
        out.println(big + small);
    }
}