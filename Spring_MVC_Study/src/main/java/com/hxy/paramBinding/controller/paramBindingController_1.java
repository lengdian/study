package com.hxy.paramBinding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

import static com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS.required;

@Controller
@RequestMapping("binding")
public class paramBindingController_1
{
    //!!!能绑定的数据优先用spring mvc的注解绑定到功能方法的参数上
    /*
    必填参数前面加@RequestParam注解，默认@RequestParam(required = true)
    可选参数直接不加@RequestParam注解，效果与@RequestParam(required = false)一样
     */
    @RequestMapping("getParam")
    public void getParam(HttpSession session, @RequestParam Integer age,@RequestParam String username){
        System.out.println(session.getId());
        System.out.println(username);
        System.out.println(age);
    }

}
