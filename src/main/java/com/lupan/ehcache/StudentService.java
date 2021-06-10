package com.lupan.ehcache;

import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/6 0006
 */

@Service
public class StudentService {

    @CacheAnnotation(value = "get", cacheElementKey = "get_student_cache", operation = CacheOperation.READ)
    @LogAnnotation(methodDescription = "查询")
    public Student get(int num){
        Student student = new Student();
        student.setName("小明");
        student.setNum(1);
        System.out.println("从后台查找学生成功！");
        return student;
    }

    @CacheAnnotation(value = "save",cacheElementKey = "get_student_cache", operation = CacheOperation.UPDATE)
    @LogAnnotation(methodDescription = "保存")
    public void save(String id){
        System.out.println("保存成功！");
    }

    @LogAnnotation(methodDescription = "删除")
    public void delete(String id){
        System.out.println("删除成功！");
    }
}
