package com.lupan.springStudy.chapter3_aop;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/6 0006
 */

@Service
public class AopService1 {

    @AopAnnotation(methodDescription = "保存")
    public void save(String id){
        System.out.println("保存成功！");
    }

    @AopAnnotation(methodDescription = "删除")
    public void delete(String id){
        System.out.println("删除成功！");
    }
}
