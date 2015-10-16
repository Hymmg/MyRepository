package com.CRM.system.model.biz.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.CRM.system.model.biz.UsersBiz;
import com.CRM.system.model.dao.UsersDao;

import entity.Users;



public class UsersBizImpl implements UsersBiz {

	
	private UsersDao usersDao;
	
	public UsersDao getUsersDao() {
		return usersDao;
	}

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	@Override
	public int login(Users users) {
		// TODO Auto-generated method stub
		Users u=usersDao.getUsersByName(users.getLoginName());
		if(u==null){
			return 2;
		}else if(!u.getLoginPassword().equals(users.getLoginPassword())){
			return 3;
		}
		return 1;
	}

	@Override
	public Users getUsersByloginName(String name) {
		// TODO Auto-generated method stub
		return usersDao.getUsersByName(name);
	}

	@Override
	public int getZongJiLu() {
		// TODO Auto-generated method stub
		int res=usersDao.getZongjiLu();
		return res;
	}

	@Override
	public List usersfanYe(int dangQianYe) {
		// TODO Auto-generated method stub
		List list=usersDao.usersfanYe(dangQianYe);
		return list;
	}

	@Override
	public int getZongJiLu(Users users) {
		// TODO Auto-generated method stub
		int res=usersDao.getZongjiLu(users);
		return res;
	}

	@Override
	public List usersfanYe(int dangQianYe, Users users) {
		// TODO Auto-generated method stub
		List list=usersDao.usersfanYe(dangQianYe,users);
		return list;
	}

	@Override
	public List getDept() {
		// TODO Auto-generated method stub
		return usersDao.getDept();
		
	}

	@Override
	public void addUsers(Users users) {
		// TODO Auto-generated method stub
		usersDao.addUsers(users);
	}


	@Override
	public void deleteUsers(Users users) {
		// TODO Auto-generated method stub
		usersDao.deleteUsers(users);
	}

	@Override
	public Users findUsers(Long long1) {
		// TODO Auto-generated method stub
		return usersDao.findUsers(long1);
	}




}
