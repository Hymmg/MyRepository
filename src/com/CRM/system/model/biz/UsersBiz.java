package com.CRM.system.model.biz;

import java.util.List;

import entity.Users;

public interface UsersBiz {


	int login(Users users);

	Users getUsersByloginName(String name);

	int getZongJiLu();

	List usersfanYe(int dangQianYe);

	int getZongJiLu(Users users);

	List usersfanYe(int dangQianYe, Users users);

	List getDept();

	void addUsers(Users users);

	Users findUsers(Long long1);

	void deleteUsers(Users users);



	





	
}
