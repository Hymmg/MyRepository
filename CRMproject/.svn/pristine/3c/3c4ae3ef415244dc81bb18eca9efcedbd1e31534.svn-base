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
		System.out.println("biz");
		System.out.println("u ="+users);
		Users u=usersDao.getUsersByName(users.getLoginName());
		System.out.println(u.getLoginName());
		if(u==null){
			return 2;
		}else if(!u.getLoginPassword().equals(users.getLoginPassword())){
			return 3;
		}
		return 1;
	}


}
