package com.szk.mapper;

import org.springframework.stereotype.Repository;

import com.szk.vo.Role;

@Repository("roleMapper")
public interface RoleMapper {

	/**
	 * 根据id获得角色信息
	 * @param id
	 * @return
	 */
	public Role getRole(Long id);
	
}
