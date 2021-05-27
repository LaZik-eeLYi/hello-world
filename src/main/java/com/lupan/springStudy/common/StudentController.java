package com.lupan.springStudy.common;

import com.lupan.springStudy.chapter3_aop.AopService1;
import com.lupan.springStudy.chapter3_aop.AopService2;
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
    private StudentService1 service1;
    @Autowired
    private StudentService2 service2;

    public void save(){
        service1.save("001");
        service2.save("lupan",1);
    }

    public void delete(){
        service1.delete("001");
        service2.delete("lupan",1);
    }
}
