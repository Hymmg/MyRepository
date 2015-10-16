package com.CRM.service.web.action;

import com.opensymphony.xwork2.ActionSupport;

import entity.ServiceTackle;

public class TackleServAction extends ActionSupport{
private  ServiceTackle serviceTackle;

public ServiceTackle getServiceTackle() {
	return serviceTackle;
}

public void setServiceTackle(ServiceTackle serviceTackle) {
	this.serviceTackle = serviceTackle;
} 
//保存处理服务信息
public String tackleServ(){
	
	return this.SUCCESS;
}
}
