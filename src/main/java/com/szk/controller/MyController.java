package com.szk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("myController")

// ָ���˶�Ӧ��URI,SpringMVC �ڳ�ʼ����ʱ��ؽ�����Щ��Ϣ��������������Ǳ�����HandlerMapping 
@RequestMapping("/my")
public class MyController {

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	// ֻ��Ӧget����
	@RequestMapping(value="/index2", method=RequestMethod.GET)
	public ModelAndView index2(
			@RequestParam("id") Long id) {// ���һ��Http���������,�����Ǵ�request��session�л�ȡ��һ��,����id�ᱻ����ΪLong��
		System.out.println("params[id]:"+id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}
