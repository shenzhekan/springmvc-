package com.szk.service;

import com.szk.vo.Role;

public interface RoleService {

	/**
	 * 根据id获取角色信息
	 * @param id
	 * @return
	 */
	public Role getRole(Long id);
	
}
