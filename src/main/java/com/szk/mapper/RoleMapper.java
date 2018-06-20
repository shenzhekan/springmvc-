package com.szk.mapper;

import org.springframework.stereotype.Repository;

import com.szk.vo.Role;

@Repository("roleMapper")
public interface RoleMapper {

	/**
	 * ����id��ý�ɫ��Ϣ
	 * @param id
	 * @return
	 */
	public Role getRole(Long id);
	
}
