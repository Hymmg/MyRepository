package com.CRM.service.model.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateOperations;

import com.CRM.service.model.dao.EstabServDao;


import entity.ServiceFeedback;
import entity.ServiceInfo;
import entity.ServiceTackle;

public class EstabServDaoImpl implements EstabServDao{
	private HibernateOperations  hibernateOperations;

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
				Query query=session.createQuery("select count(id) from ServiceInfo");
				
				return query.uniqueResult();
			}
			
		});
		int res=Integer.parseInt(obj.toString());
		return res;
	}

	@Override
	public List fanYe(final int dangQianYe) {
		List list=hibernateOperations.executeFind(new HibernateCallback() {
	 

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa");
				query.setFirstResult((dangQianYe-1)*5);
				query.setMaxResults(5);
				List list=query.list();
				return list;
			}
		
		});
		return list;
	}

	@Override
	public ServiceInfo huoQuSerInfo(final Long id) {
		ServiceInfo serviceInfo=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where s.id=?");
				   query.setLong(0, id);
				   ServiceInfo ser=(ServiceInfo)query.uniqueResult();
				return ser;
			}
		
		});
		return serviceInfo;
	}

	@Override
	public void baoCun(ServiceInfo serviceInfo) {
		
		hibernateOperations.saveOrUpdate(serviceInfo);
		
	}

	@Override
	public void quDeleteServ(ServiceInfo serviceInfo) {
		hibernateOperations.delete(serviceInfo);
		
	}

	@Override
	public ServiceInfo getServiceInfo(final Long id) {
		ServiceInfo serviceInfo=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where s.id=?");
				   query.setLong(0, id);
				   ServiceInfo ser=(ServiceInfo)query.uniqueResult();
				return ser;
			}
		
		});
		return serviceInfo;
	}

	@Override
	public int getZongJiLu(final ServiceInfo serviceInfo,final String serviceType,
		final	String serviceStatus) {
		System.out.println("sousuodao");
		System.out.println(serviceInfo.getServiceName());
		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				String hql="select count(id) from ServiceInfo s where 1=1";
				if (serviceInfo != null && serviceInfo.getServiceName() != null
						&& !"".equals(serviceInfo.getServiceName())) {
					hql += " and s.serviceName like :serviceName";
				}
				if("投诉服务".equals(serviceType)){
					hql+=" and s.serviceType='投诉服务'";
					}
				if("售前服务".equals(serviceType)){
					hql+=" and s.serviceType='售前服务'";
				}
				if("售后服务".equals(serviceType)){
					hql+=" and s.serviceType='售后服务'";
					}
				if("咨询服务".equals(serviceType)){
					hql+=" and s.serviceType='咨询服务'";
				}
			if("新创建".equals(serviceStatus)){
				hql+=" and s.serviceStatus='新创建'";
				}
			if("已提交".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已提交'";
				}
			if("已分配".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已分配'";
				}
			if("已处理".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已处理'";
				}
			if("已反馈".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已反馈'";
				}
			if("已归档".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已归档'";
				}
				Query query=session.createQuery(hql);
				if (serviceInfo != null && serviceInfo.getServiceName() != null
						&& !"".equals(serviceInfo.getServiceName())) {
					query.setString("serviceName", "%"+serviceInfo.getServiceName()+"%");
				}
				return query.uniqueResult();
			}
			
		});
	int res=Integer.parseInt(obj.toString());
		return res;
	}

	@Override
	public List fanYe(final int dangQianYe,final ServiceInfo serviceInfo,
		final	String serviceType,final String serviceStatus) {
		List list=hibernateOperations.executeFind(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				String hql="from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where 1=1";
				if (serviceInfo != null && serviceInfo.getServiceName() != null
						&& !"".equals(serviceInfo.getServiceName())) {
					hql += " and s.serviceName like :serviceName";
				}
				if("投诉服务".equals(serviceType)){
					hql+=" and s.serviceType='投诉服务'";
					}
				if("售前服务".equals(serviceType)){
					hql+=" and s.serviceType='售前服务'";
				}
			if("售后服务".equals(serviceType)){
					hql+=" and s.serviceType='售后服务'";
					}
				if("咨询服务".equals(serviceType)){
					hql+=" and s.serviceType='咨询服务'";
					}
			if("新创建".equals(serviceStatus)){
				hql+=" and s.serviceStatus='新创建'";
			}
			if("已提交".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已提交'";
				}
			if("已分配".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已分配'";
				}
			if("已处理".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已处理'";
				}
			if("已反馈".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已反馈'";
				}
			if("已归档".equals(serviceStatus)){
				hql+=" and s.serviceStatus='已归档'";
				}

			Query query=session.createQuery(hql);
			
				if (serviceInfo != null && serviceInfo.getServiceName() != null
						&& !"".equals(serviceInfo.getServiceName())) {
					query.setString("serviceName", "%"+serviceInfo.getServiceName()+"%");
				}
				query.setFirstResult((dangQianYe-1)*5);
				query.setMaxResults(5);
				List list=query.list();
				return list;
			}
			
		});
		return list;
	}

	@Override
	public List getUsers() {
		List list=hibernateOperations.executeFind(new HibernateCallback() {
			 

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from Users");
				
				List list=query.list();
				return list;
			}
		
		});
		return list;
	}

	@Override
	public int getTackleZongJiLu() {
		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select count(id) from ServiceInfo s where s.serviceStatus='已分配'");
				
				return query.uniqueResult();
			}
			
		});
		int res=Integer.parseInt(obj.toString());
		return res;
		
	}

	@Override
	public List tackleFanYe(final int dangQianYe) {
		List list=hibernateOperations.executeFind(new HibernateCallback() {
			 

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where s.serviceStatus='已分配'");
				query.setFirstResult((dangQianYe-1)*5);
				query.setMaxResults(5);
				List list=query.list();
				return list;
			}
		
		});
		return list;
	}

	@Override
	public void saveTackleServ(ServiceTackle serviceTackle) {
		hibernateOperations.saveOrUpdate(serviceTackle);
	}
//获取服务分配主页面总记录
	@Override
	public int getFenPeiZongJiLu() {
		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select count(id) from ServiceInfo s where s.serviceStatus='新创建'");
				
				return query.uniqueResult();
			}
			
		});
		int res=Integer.parseInt(obj.toString());
		return res;
		
	}
//获取服务分配主页面list
	@Override
	public List fenPeiFanYe(final int dangQianYe) {
		List list=hibernateOperations.executeFind(new HibernateCallback() {
			 

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where s.serviceStatus='新创建'");
				query.setFirstResult((dangQianYe-1)*5);
				query.setMaxResults(5);
				List list=query.list();
				return list;
			}
		
		});
		return list;
	}

	@Override
	public int getFeedBackZongJiLu() {
		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select count(id) from ServiceInfo s where s.serviceStatus='已处理'");
				
				return query.uniqueResult();
			}
			
		});
		int res=Integer.parseInt(obj.toString());
		return res;
	}

	@Override
	public List feedBackFanYe(final int dangQianYe) {
		List list=hibernateOperations.executeFind(new HibernateCallback() {
			 

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where s.serviceStatus='已处理'");
				query.setFirstResult((dangQianYe-1)*5);
				query.setMaxResults(5);
				List list=query.list();
				return list;
			}
		
		});
		return list;
	}

	@Override
	public void saveFeedBackServ(ServiceFeedback serviceFeedback) {
		hibernateOperations.saveOrUpdate(serviceFeedback);
		
	}

	@Override
	public int getGuiDangZongJiLu() {
		Object obj=hibernateOperations.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query=session.createQuery("select count(id) from ServiceInfo s where s.serviceStatus='已反馈'");
				
				return query.uniqueResult();
			}
			
		});
		int res=Integer.parseInt(obj.toString());
		return res;
	}

	@Override
	public List guiDangFanYe(final int dangQianYe) {
		List list=hibernateOperations.executeFind(new HibernateCallback() {
			 

			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query=session.createQuery("from ServiceInfo s left join fetch  s.usersByUsersOperateId so left join fetch s.usersByUsersAllocateId sa where s.serviceStatus='已反馈'");
				query.setFirstResult((dangQianYe-1)*5);
				query.setMaxResults(5);
				List list=query.list();
				return list;
			}
		
		});
		return list;
	}

}
