package com.lupan.ehcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void get(){
       Student student = studentService.get(1);
        System.out.println(student.getName()+"已找到！");
    }

    public void save(){
        studentService.save("001");
    }
}
