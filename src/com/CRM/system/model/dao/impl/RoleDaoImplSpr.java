package com.CRM.system.model.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateOperations;

import com.CRM.system.model.dao.RoleDao;

import entity.Role;

public class RoleDaoImplSpr implements RoleDao {

	private HibernateOperations hibernateOperations;
	
	public HibernateOperations getHibernateOperations() {
		return hibernateOperations;
	}

	public void setHibernateOperations(HibernateOperations hibernateOperations) {
		this.hibernateOperations = hibernateOperations;
	}
	@Override
	public int getZongJiLu() {

		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query=session.createQuery("select count(id) from Role");
				return query.uniqueResult();
			}
		});
		
		int res=Integer.parseInt(obj.toString());
		return res;
	}

	@Override
	public List rolefanYe(final int dangQianYe) {
		// TODO Auto-generated method stub
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {

				Query query=session.createQuery("from Role r left join fetch r.dept d left join fetch r.users u");
				query.setFirstResult((dangQianYe-1)*3);
				query.setMaxResults(3);
				List list=query.list();
				return list;
			}
		} );
		return list;
	}
//
//	@Override
//	public int getZongJiLu(final Role role) {
//		
//		Object obj=hibernateOperations.execute(new HibernateCallback() {
//
//			@Override
//			public Object doInHibernate(Session session)
//					throws HibernateException, SQLException {
//			//	System.out.println(role.getRoleName());
//				String hql="select count(r.id) from Role r where 1=1";
//				if(role!=null&&role.getRoleName()!=null&&!"".equals(role.getRoleName())){
//				 hql+=" and r.roleName like :name";
//				}
//				
//				Query query=session.createQuery(hql);
//				//为语句的参数赋值
//				if(role!=null&&role.getRoleName()!=null&&!"".equals(role.getRoleName())){
//				query.setString("name", "%"+role.getRoleName()+"%");
//				}
//				return query.uniqueResult();
//			}
//			
//		});
//		
//		int res=Integer.parseInt(obj.toString());
////		System.out.println("按条件查询");
////		System.out.println(res);
//		return res;
//	}
//
//	@Override
//	public List rolefanYe(final int dangQianYe, final Role role) {
//		// TODO Auto-generated method stub
//		
//		
//		
//		List list=hibernateOperations.executeFind(new HibernateCallback() {
//
//			@Override
//			public Object doInHibernate(Session session)
//					throws HibernateException, SQLException {
//				// TODO Auto-generated method stub
//				String hql="from Role r left join fetch r.dept d left join fetch r.users u where 1=1";
//				if(role!=null&&role.getRoleName()!=null&&!"".equals(role.getRoleName())){
//					 hql+=" and r.roleName like :name"	;
//				}
//				Query query=session.createQuery(hql);
//				//为语句的参数赋值
//				if(role!=null&&role.getRoleName()!=null&&!"".equals(role.getRoleName())){
//				query.setString("name","%"+role.getRoleName()+"%");
//				}
//				query.setFirstResult((dangQianYe-1)*3);
//				query.setMaxResults(3);
//				List list=query.list();
//				return list ;
//			}
//		} );
//		return list;
//	}

	@Override
	public int getZongJiLu(final String roleName) {
		
		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
			//	System.out.println(role.getRoleName());
				String hql="select count(r.id) from Role r where 1=1";
				if(roleName!=null&&!"".equals(roleName)){
				 hql+=" and r.roleName like :name";
				}
				
				Query query=session.createQuery(hql);
				//为语句的参数赋值
				if(roleName!=null&&!"".equals(roleName)){
				query.setString("name", "%"+roleName+"%");
				}
				return query.uniqueResult();
			}
			
		});
		
		int res=Integer.parseInt(obj.toString());
//		System.out.println("按条件查询");
//		System.out.println(res);
		return res;
	}

	@Override
	public List rolefanYe(final int dangQianYe, final String roleName) {
		
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql="from Role r left join fetch r.dept d left join fetch r.users u where 1=1";
				if(roleName!=null&&!"".equals(roleName)){
				hql+=" and r.roleName like :name"	;
				}
				Query query=session.createQuery(hql);
				//为语句的参数赋值
				if(roleName!=null&&!"".equals(roleName)){
					query.setString("name", "%"+roleName+"%");
				}
				query.setFirstResult((dangQianYe-1)*3);
				query.setMaxResults(3);
				List list=query.list();
				return list ;
			}
		} );
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
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		hibernateOperations.saveOrUpdate(role);
	}

	@Override
	public Role findRole(final Long id) {
		// TODO Auto-generated method stub
		Role role=(Role)hibernateOperations.execute(new HibernateCallback() {

			
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				Query query=session.createQuery("from Role r left join fetch r.dept d left join fetch r.users u where r.id=?");
				query.setLong(0, id);
				Role r=(Role)query.uniqueResult();
				return r;
			}
	});
	     return role;

	}

	@Override
	public void deleteRole(Role role) {
		// TODO Auto-generated method stub
		hibernateOperations.delete(role);
	}

}
