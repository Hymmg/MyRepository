package com.CRM.system.model.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.aspectj.weaver.ast.Call;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateOperations;

import com.CRM.system.model.dao.UsersDao;

import entity.Role;
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
				Query query=session.createQuery("from Users u left join fetch u.dept d left join fetch u.roles_1 r where u.loginName=?");
				query.setString(0, name);
				return query.list();
			}
		});
		return list.isEmpty()?null:(Users)list.get(0);
	}

	
	@Override
	public int getZongjiLu() {
		// TODO Auto-generated method stub
		Object o=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				
				Query query=session.createQuery("select count(id) from Users");
				
				return query.uniqueResult();
			}
		});
		int res=Integer.parseInt(o.toString());
		return res;
	}

	@Override
	public List usersfanYe(final int dangQianYe) {
		// TODO Auto-generated method stub
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query=session.createQuery("from Users u left join fetch u.dept d left join fetch u.roles_1 r");
				query.setFirstResult((dangQianYe-1)*3);
				query.setMaxResults(3);
				List list=query.list();
				return list;
			}
		});
		
		
		return list;
	}

	@Override
	public int getZongjiLu(final Users users) {
		// TODO Auto-generated method stub
		Object o=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="select count(u.id) from Users u where 1=1";
				if(users!=null&&users.getEmployeName()!=null&&!"".equals(users.getEmployeName())){
				 hql+=" and u.employeName like :name";
				}
				Query query=session.createQuery(hql);
				if(users!=null&&users.getEmployeName()!=null&&!"".equals(users.getEmployeName())){
				query.setString("name", "%"+users.getEmployeName()+"%");
				}
				
				return query.uniqueResult();
			}
		});
	
		int res=Integer.parseInt(o.toString());
        return res;
	}

	@Override
	public List usersfanYe(final int dangQianYe, final Users users) {
		// TODO Auto-generated method stub
		
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
			
				String hql="from Users u left join fetch u.dept d left join fetch u.roles_1 r where 1=1";
				if(users!=null&&users.getEmployeName()!=null&&!"".equals(users.getEmployeName())){
				 hql+=" and u.employeName like :name";
				}
				Query query=session.createQuery(hql);
				if(users!=null&&users.getEmployeName()!=null&&!"".equals(users.getEmployeName())){
				query.setString("name", "%"+users.getEmployeName()+"%");
				}
				query.setFirstResult((dangQianYe-1)*3);
				query.setMaxResults(3);
				List list=query.list();
				return list;
			}
		});
		
		return list;
	}

	@Override
	public List getDept() {
		// TODO Auto-generated method stub
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query=session.createQuery("from Dept");
		        List list=query.list();
				return list;
			}
		} );
		return list;
	}

	@Override
	public void addUsers(Users users) {
		// TODO Auto-generated method stub

		hibernateOperations.saveOrUpdate(users);
		
	}

	@Override
	public Users findUsers(final Long id) {
		// TODO Auto-generated method stub
		Users users=(Users)hibernateOperations.execute(new HibernateCallback() {

			
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query=session.createQuery("from Users u left join fetch u.dept d left join fetch u.roles_1 r where u.id=?");
				query.setLong(0, id);
				Users u=(Users)query.uniqueResult();
				return u;
			}
	});
	     return users;
	}

	@Override
	public void deleteUsers(Users users) {
		// TODO Auto-generated method stub
		hibernateOperations.delete(users);
	}


}
