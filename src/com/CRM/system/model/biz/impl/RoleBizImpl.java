package com.CRM.system.model.biz.impl;

import java.util.List;

import com.CRM.system.model.biz.RoleBiz;
import com.CRM.system.model.dao.RoleDao;

import entity.Role;

public class RoleBizImpl implements RoleBiz {

	private RoleDao roleDao;
	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	@Override
	public int getZongJiLu() {
		
		int res=roleDao.getZongJiLu();
		return res;
	}

	@Override
	public List rolefanYe(int dangQianYe) {
		
		List list=roleDao.rolefanYe(dangQianYe);
		return list;
	}

//	@Override
//	public int getZongJiLu(Role role) {
//		// TODO Auto-generated method stub
//		return roleDao.getZongJiLu(role);
//	}
//
//	@Override
//	public List rolefanYe(int dangQianYe, Role role) {
//		// TODO Auto-generated method stub
//		return roleDao.rolefanYe(dangQianYe,role);
//	}

	@Override
	public int getZongJiLu(String roleName) {
		// TODO Auto-generated method stub
		return roleDao.getZongJiLu(roleName);
	}

	@Override
	public List rolefanYe(int dangQianYe, String roleName) {
		// TODO Auto-generated method stub
		return roleDao.rolefanYe(dangQianYe,roleName);
	}

	@Override
	public List getDept() {
		// TODO Auto-generated method stub
		return roleDao.getDept();
	}

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		roleDao.addRole(role);
	}

	@Override
	public Role findRole(Long id) {
		// TODO Auto-generated method stub
		return roleDao.findRole(id);
	}

	@Override
	public void deleteRole(Role role) {
		// TODO Auto-generated method stub
		roleDao.deleteRole(role);
	}



}
