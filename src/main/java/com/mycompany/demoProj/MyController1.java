package com.mycompany.demoProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author suiyue
 * @description TODO
 * @date 2019/5/29 19:57
 */
@Controller
public class MyController1 {
    @RequestMapping(method = RequestMethod.GET,value="/helloworld")
    public String printHelloWorld() {
        System.out.println("hello!Spring MVC!");
        return "success";
    }

}
