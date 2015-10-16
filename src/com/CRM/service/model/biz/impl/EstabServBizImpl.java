package com.CRM.service.model.biz.impl;

import java.util.List;

import com.CRM.service.model.biz.EstabServBiz;
import com.CRM.service.model.dao.EstabServDao;

import entity.ServiceFeedback;
import entity.ServiceInfo;
import entity.ServiceTackle;

public class EstabServBizImpl implements EstabServBiz{
private EstabServDao estabServDao ;

public EstabServDao getEstabServDao() {
	return estabServDao;
}

public void setEstabServDao(EstabServDao estabServDao) {
	this.estabServDao = estabServDao;
}

@Override
public int getZongJiLu() {
	int res=estabServDao.getZongJiLu();
	return res;
}

@Override
public List fanYe(int dangQianYe) {
	List list=estabServDao.fanYe(dangQianYe);
	return list;
}

@Override
public ServiceInfo huoQuSerInfo(Long id) {
	
	return estabServDao.huoQuSerInfo(id);
}

@Override
public void baoCun(ServiceInfo serviceInfo) {
	estabServDao.baoCun(serviceInfo);
	
}

@Override
public void quDeleteServ(ServiceInfo serviceInfo) {
	estabServDao.quDeleteServ(serviceInfo);
	
}

@Override
public ServiceInfo getServiceInfo(Long id) {
	
 return estabServDao.getServiceInfo(id);
}

@Override
public int getZongJiLu(ServiceInfo serviceInfo, String serviceType,
		String serviceStatus) {
	
	return estabServDao.getZongJiLu(serviceInfo, serviceType,serviceStatus);
}

@Override
public List fanYe(int dangQianYe, ServiceInfo serviceInfo, String serviceType,
		String serviceStatus) {
	
	return estabServDao.fanYe(dangQianYe,serviceInfo,serviceType,serviceStatus);
}

@Override
public List getUsers() {
	// TODO Auto-generated method stub
	return estabServDao.getUsers();
}
//处理服务的
@Override
public int getTackleZongJiLu() {
	int res=estabServDao.getTackleZongJiLu();
	return res;
}
//处理服务的
@Override
public List tackleFanYe(int dangQianYe) {
	List list=estabServDao.tackleFanYe(dangQianYe);
	return list;
}

@Override
public void saveTackleServ(ServiceTackle serviceTackle) {
	estabServDao.saveTackleServ(serviceTackle);
	
}

@Override
public int getFenPeiZongJiLu() {
	
	return estabServDao.getFenPeiZongJiLu();
}

@Override
public List fenPeiFanYe(int dangQianYe) {
	
	return estabServDao.fenPeiFanYe(dangQianYe);
}
//获取待反馈总记录
@Override
public int getFeedBackZongJiLu() {
	return estabServDao.getFeedBackZongJiLu();
}

@Override
public List feedBackFanYe(int dangQianYe) {
	
	return estabServDao.feedBackFanYe(dangQianYe);
}

@Override
public void saveFeedBackServ(ServiceFeedback serviceFeedback) {
	estabServDao.saveFeedBackServ(serviceFeedback);
	
}

@Override
public int getGuiDangZongJiLu() {
	
 return estabServDao.getGuiDangZongJiLu();
}

@Override
public List guiDangFanYe(int dangQianYe) {
	
	return estabServDao.guiDangFanYe(dangQianYe);
}
}
