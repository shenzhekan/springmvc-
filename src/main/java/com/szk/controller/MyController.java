package com.szk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("myController")

// 指定了对应的URI,SpringMVC 在初始化的时候回解析这些信息，存放起来，于是便有了HandlerMapping 
@RequestMapping("/my")
public class MyController {

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	// 只相应get请求
	@RequestMapping(value="/index2", method=RequestMethod.GET)
	public ModelAndView index2(
			@RequestParam("id") Long id) {// 获得一个Http的请求参数,就像是从request或session中获取的一样,参数id会被解析为Long型
		System.out.println("params[id]:"+id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}
