package com.mycompany.demoProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    @RequestMapping(value="/test.do",method= RequestMethod.POST,produces="text/html;charset=UTF-8;")
    @ResponseBody
    public String test(){
        System.out.print("\n + react test.do");
        return "hello world";
    }
}
