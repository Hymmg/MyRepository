package com.CRM.service.web.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





import com.CRM.service.model.biz.EstabServBiz;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.ServiceFeedback;
import entity.ServiceInfo;
import entity.ServiceTackle;
import entity.Users;

public class EstabServAction extends ActionSupport{
	
private EstabServBiz  estabServBiz;
private ServiceInfo  serviceInfo; 
private int dangQianYe = 1;
private int zongYe = 0;
private int zongJiLu = 0;
private List jsonList;
private String  serviceType;
private String serviceStatus;
private  Users users;
private  ServiceTackle serviceTackle; 
private ServiceFeedback serviceFeedback;
public ServiceFeedback getServiceFeedback() {
	return serviceFeedback;
}

public void setServiceFeedback(ServiceFeedback serviceFeedback) {
	this.serviceFeedback = serviceFeedback;
}

public ServiceTackle getServiceTackle() {
	return serviceTackle;
}

public void setServiceTackle(ServiceTackle serviceTackle) {
	this.serviceTackle = serviceTackle;
}

public Users getUsers() {
	return users;
}

public void setUsers(Users users) {
	this.users = users;
}

public String getServiceType() {
	return serviceType;
}

public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
}



public String getServiceStatus() {
	return serviceStatus;
}

public void setServiceStatus(String serviceStatus) {
	this.serviceStatus = serviceStatus;
}

public int getDangQianYe() {
	return dangQianYe;
}

public void setDangQianYe(int dangQianYe) {
	this.dangQianYe = dangQianYe;
}

public int getZongYe() {
	return zongYe;
}

public void setZongYe(int zongYe) {
	this.zongYe = zongYe;
}

public int getZongJiLu() {
	return zongJiLu;
}

public void setZongJiLu(int zongJiLu) {
	this.zongJiLu = zongJiLu;
}

public List getJsonList() {
	return jsonList;
}

public void setJsonList(List jsonList) {
	this.jsonList = jsonList;
}

public ServiceInfo getServiceInfo() {
	return serviceInfo;
}

public void setServiceInfo(ServiceInfo serviceInfo) {
	this.serviceInfo = serviceInfo;
}

public EstabServBiz getEstabServBiz() {
	return estabServBiz;
}

public void setEstabServBiz(EstabServBiz estabServBiz) {
	this.estabServBiz = estabServBiz;
}
public String fenYe(){

	this.zongJiLu=estabServBiz.getZongJiLu();
	this.zongYe=this.zongJiLu/5;
	if(this.zongJiLu%5>0){
		this.zongYe+=1;
	}
	System.out.println(this.zongJiLu);
	List list=	estabServBiz.fanYe(this.dangQianYe);
	
ActionContext ac=ActionContext.getContext();
ac.put("list", list);
	
	
	return this.SUCCESS;
	
}
public String huoQuSerInfo(){
	
	
	
	serviceInfo=estabServBiz.huoQuSerInfo(serviceInfo.getId());
	
	return this.SUCCESS;
}

public String baoCun(){
	
	System.out.println(users.getId());
	serviceInfo.setUsersByUsersOperateId(users);
	
	serviceInfo.setLastTime(new Date());
	estabServBiz.baoCun(serviceInfo);
	return this.SUCCESS;
}
public String quDeleteServ(){
	System.out.println(serviceInfo.getId()+"kk");
	estabServBiz.quDeleteServ(serviceInfo);
	return this.SUCCESS;
}
public String showServ(){
	serviceInfo=estabServBiz.getServiceInfo(serviceInfo.getId());
	return this.SUCCESS;
}
public String souSuoServ(){
	
	this.zongJiLu=estabServBiz.getZongJiLu(serviceInfo,serviceType,serviceStatus);
	
	this.zongYe=this.zongJiLu/5;
	if(this.zongJiLu%5>0){
		this.zongYe+=1;
	}
	
List list=	estabServBiz.fanYe(this.dangQianYe,serviceInfo,serviceType,serviceStatus);
	
ActionContext ac=ActionContext.getContext();
ac.put("list", list);
	
	return this.SUCCESS;
}
public String goFenPeiServ(){
	serviceInfo=estabServBiz.getServiceInfo(serviceInfo.getId());
	
	List list=estabServBiz.getUsers();
	Map map=new HashMap();
	for(Object obj:list){
	Users	u=(Users)obj;
		map.put(u.getId(), u);
	}
	ActionContext ac=ActionContext.getContext();
	ac.put("map", map);
	return this.SUCCESS;
}
//服务处理 进入服务处理主页面
public String tackleFenYeServ(){
	this.zongJiLu=estabServBiz.getTackleZongJiLu();
	this.zongYe=this.zongJiLu/5;
	if(this.zongJiLu%5>0){
		this.zongYe+=1;
	}
	System.out.println(this.zongJiLu);
	List list=	estabServBiz.tackleFanYe(this.dangQianYe);
	//System.out.println(list.size());
	
ActionContext ac=ActionContext.getContext();
ac.put("list", list);
	return this.SUCCESS;
}
//转到处理服务页面，获取待处理的服务信息
public String goTackleServ(){
	serviceInfo=estabServBiz.huoQuSerInfo(serviceInfo.getId());
	return this.SUCCESS;
}
//保存处理服务信息
public String tackleServ(){

	serviceInfo=estabServBiz.huoQuSerInfo(serviceInfo.getId());
	serviceInfo.setServiceStatus("已处理");
	serviceTackle.setServiceInfo(serviceInfo);
	estabServBiz.baoCun(serviceInfo);
	estabServBiz.saveTackleServ(serviceTackle);
	return this.SUCCESS;
}
//进入服务管理分配人员主页面
public String goFenPeiMainServ(){
	this.zongJiLu=estabServBiz.getFenPeiZongJiLu();
	this.zongYe=this.zongJiLu/5;
	if(this.zongJiLu%5>0){
		this.zongYe+=1;
	}
	System.out.println(this.zongJiLu);
	List list=	estabServBiz.fenPeiFanYe(this.dangQianYe);
	//System.out.println(list.size());
	
ActionContext ac=ActionContext.getContext();
ac.put("list", list);
	return this.SUCCESS;
}
//保存分配后的服务信息
	public String fenPeiServ() {

		serviceInfo = estabServBiz.huoQuSerInfo(serviceInfo.getId());
		
		serviceInfo.setServiceStatus("已分配");
		serviceInfo.setUsersByUsersAllocateId(users);
		estabServBiz.baoCun(serviceInfo);
		return this.SUCCESS;
	}
//进入服务管理反馈信息主页面
	public String goFeedBackMainServ(){
		this.zongJiLu=estabServBiz.getFeedBackZongJiLu();
		this.zongYe=this.zongJiLu/5;
		if(this.zongJiLu%5>0){
			this.zongYe+=1;
		}
		System.out.println(this.zongJiLu);
		List list=	estabServBiz.feedBackFanYe(this.dangQianYe);
		//System.out.println(list.size());
		
	ActionContext ac=ActionContext.getContext();
	ac.put("list", list);
		return this.SUCCESS;
	}
	//进入服务管理反馈页面
	public String goFeedBackServ(){
		serviceInfo=estabServBiz.getServiceInfo(serviceInfo.getId());
		
		return this.SUCCESS;
	}
//保存服务反馈信息
public String feedBackServ(){
	serviceInfo=estabServBiz.huoQuSerInfo(serviceInfo.getId());
	serviceInfo.setServiceStatus("已反馈");
	serviceFeedback.setServiceInfo(serviceInfo);
	estabServBiz.baoCun(serviceInfo);
	estabServBiz.saveFeedBackServ(serviceFeedback);
	return this.SUCCESS;
}
//进入服务管理归档主页面
public String goGuiDangMainServ(){
	this.zongJiLu=estabServBiz.getGuiDangZongJiLu();
	this.zongYe=this.zongJiLu/5;
	if(this.zongJiLu%5>0){
		this.zongYe+=1;
	}
	System.out.println(this.zongJiLu);
	List list=	estabServBiz.guiDangFanYe(this.dangQianYe);
	//System.out.println(list.size());
	
ActionContext ac=ActionContext.getContext();
ac.put("list", list);
	return this.SUCCESS;

	
}
public String goGuiDangServ(){
	serviceInfo=estabServBiz.getServiceInfo(serviceInfo.getId());
	serviceInfo.setServiceStatus("已归档");
	estabServBiz.baoCun(serviceInfo);
	return this.SUCCESS;
}
public String quSubmitServ(){
	serviceInfo=estabServBiz.getServiceInfo(serviceInfo.getId());
	serviceInfo.setServiceStatus("已提交");
	estabServBiz.baoCun(serviceInfo);
	return this.SUCCESS;
}
}
