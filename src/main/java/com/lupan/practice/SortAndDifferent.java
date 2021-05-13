package com.lupan.practice;

import java.util.*;

/**
 * TODO 根据给出的数组，去重排序
 *
 * @author lupan
 * @version 2016/2/29 0029
 */
public class SortAndDifferent {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new TreeSet<Integer>();
        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
           set.add(sc.nextInt());
        }

        Integer[] array = new Integer[set.size()];
        set.toArray(array);

        for (int i :array) {
            System.out.println(i);
        }

    }

}
