package com.CRM.system.model.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateOperations;

import com.CRM.system.model.dao.UsersDao;

import entity.Users;

public class UsersDaoImplSpr implements UsersDao {

	private HibernateOperations hibernateOperations;
	
	
	public HibernateOperations getHibernateOperations() {
		return hibernateOperations;
	}

	public void setHibernateOperations(HibernateOperations hibernateOperations) {
		this.hibernateOperations = hibernateOperations;
	}

	@Override
	public Users getUsersByName(final String name) {
		// TODO Auto-generated method stub
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				System.out.println(name);
				Query query=session.createQuery("from Users where login_name=?");
				query.setString(0, name);
				System.out.println(query);
				return query.list();
			}
		 
		
		
		});
		
		System.out.println((Users)list.get(0));
		return list.isEmpty()?null:(Users)list.get(0);
	}



}
