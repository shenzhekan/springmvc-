package com.szk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.szk.mapper.RoleMapper;
import com.szk.service.RoleService;
import com.szk.vo.Role;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	@Qualifier("roleMapper")
	private RoleMapper roleMapper;
	
	@Autowired
	@Qualifier("role")
	private Role role;
	
	@Override
	public Role getRole(Long id) {
		role = roleMapper.getRole(id);
		return role;
	}

}
