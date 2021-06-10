package com.lupan.springStudy.chapter3_aop.aspectj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * TODO
 *
 * @author lupan
 * @version 2016/4/6 0006
 */
@Controller
public class AopController {

    @Autowired
    private AopService1 service1;
    @Autowired
    private AopService2 service2;

    public void save(){
        service1.save("001");
        service2.save("lupan",1);
    }

    public void delete(){
        service1.delete("001");
        service2.delete("lupan",1);
    }
}
