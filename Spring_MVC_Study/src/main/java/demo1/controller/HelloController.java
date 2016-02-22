package demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//使用注解方式无需再实现Controller接口（实现Controller接口方式已不推荐使用）
@Controller
@RequestMapping("/test")
/*
 * controller主要学习内容：
 * 1、请求映射规则
 * 2、数据绑定功能
 * 3、数据的类型转换、验证与格式化
 */
public class HelloController
{
	@RequestMapping("/sayHello")
	public ModelAndView sayHello(@ModelAttribute("message") String msg)
	{
		ModelAndView mav = new ModelAndView();

		// mav.addObject("message", "Hello World");
		mav.setViewName("hello");
		System.out.println(msg);

		return mav;
	}
}
