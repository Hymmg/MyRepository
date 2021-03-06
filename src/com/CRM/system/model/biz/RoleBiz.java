package com.CRM.system.model.biz;

import java.util.List;

import entity.Role;

public interface RoleBiz {

	int getZongJiLu();

	List rolefanYe(int dangQianYe);
//
//	int getZongJiLu(Role role);
//
//	List rolefanYe(int dangQianYe, Role role);

	int getZongJiLu(String roleName);

	List rolefanYe(int dangQianYe, String roleName);

	List getDept();

	void addRole(Role role);

	Role findRole(Long id);

	void deleteRole(Role role);

}
