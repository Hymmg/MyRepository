package com.CRM.system.model.dao;

import java.util.List;

import entity.Users;

public interface UsersDao {

	

	public Users getUsersByName(String name);

	public int getZongjiLu();

	public List usersfanYe(int dangQianYe);

	public int getZongjiLu(Users users);

	public List usersfanYe(int dangQianYe, Users users);

	public List getDept();

	public void addUsers(Users users);

	public Users findUsers(Long id);

	public void deleteUsers(Users users);




}
