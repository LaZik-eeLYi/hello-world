package com.lupan.springStudy.common;

import com.lupan.springStudy.chapter3_aop.AopAnnotation;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/6 0006
 */

@Service
public class StudentService2 {

    @AopAnnotation(methodDescription = "保存学生")
    public void save(String name,int num){
        System.out.println("保存学生成功！");
    }

    @AopAnnotation(methodDescription = "删除学生")
    public void delete(String name,int num){
        System.out.println("删除学生成功！");
    }
}