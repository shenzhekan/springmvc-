package com.szk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.szk.service.RoleService;
import com.szk.vo.Role;

@Controller("roleController")
@RequestMapping("/role")
public class RoleController {

	@Autowired
	@Qualifier("role")
	private Role role;
	
	@Autowired
	@Qualifier("roleService")
	private RoleService roleService;
	
	@RequestMapping(value="/getRole", method=RequestMethod.GET)
	public ModelAndView getRole(
			@RequestParam("id") Long id) {
			
		role = roleService.getRole(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("roleDetails");
		mv.addObject("role", role);
		return mv;
		
	}
	
}
