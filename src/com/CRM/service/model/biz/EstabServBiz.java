package com.CRM.service.model.biz;

import java.util.List;

import entity.ServiceFeedback;
import entity.ServiceInfo;
import entity.ServiceTackle;

public interface EstabServBiz {

	int getZongJiLu();

	List fanYe(int dangQianYe);

	ServiceInfo huoQuSerInfo(Long id);

	void baoCun(ServiceInfo serviceInfo);

	void quDeleteServ(ServiceInfo serviceInfo);

	ServiceInfo getServiceInfo(Long id);

	int getZongJiLu(ServiceInfo serviceInfo, String serviceType,
			String serviceStatus);

	List fanYe(int dangQianYe, ServiceInfo serviceInfo,String serviceType,
			String serviceStatus);

	List getUsers();

	int getTackleZongJiLu();

	List tackleFanYe(int dangQianYe);

	void saveTackleServ(ServiceTackle serviceTackle);

	int getFenPeiZongJiLu();

	List fenPeiFanYe(int dangQianYe);

	int getFeedBackZongJiLu();

	List feedBackFanYe(int dangQianYe);

	void saveFeedBackServ(ServiceFeedback serviceFeedback);

	int getGuiDangZongJiLu();

	List guiDangFanYe(int dangQianYe);

}
