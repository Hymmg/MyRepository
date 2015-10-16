package com.CRM.system.web.action;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.CRM.system.model.biz.RoleBiz;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Dept;

import entity.Role;


public class RoleAction extends ActionSupport {

	//private LoginAction loginAction=new LoginAction();
	private Date date;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private String roleName;	
	private long roleId;
	
	private RoleBiz roleBiz;
	private Role role;
	private int dangQianYe=1;
	private int zongYe=0;
	private int zongJiLu=0;
	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public RoleBiz getRoleBiz() {
		return roleBiz;
	}

	public void setRoleBiz(RoleBiz roleBiz) {
		this.roleBiz = roleBiz;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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




	
	public String rolefenYe(){
	//	System.out.println("进入没有条件的分页方法");
		this.zongJiLu=roleBiz.getZongJiLu();
		this.zongYe=this.zongJiLu/3;
		if(this.zongJiLu%3>0){
			this.zongYe+=1;
		}
		List list=roleBiz.rolefanYe(this.dangQianYe);
		ActionContext ac=ActionContext.getContext();
		ac.put("list", list);
		return this.SUCCESS;
	}
	
//	public String search(){
//	
//				this.zongJiLu=roleBiz.getZongJiLu(role);
//				System.out.println("action:"+role.getRoleName());
//				//计算总页数
//				this.zongYe=this.zongJiLu/3;
//				if(this.zongJiLu%3>0){
//					this.zongYe+=1;
//				}
//				//获取指定页面数据
//				
//				List list=roleBiz.rolefanYe(this.dangQianYe,role);
//				ActionContext ac=ActionContext.getContext();
//				ac.put("list", list);
//				return this.SUCCESS;
//	}
	
	public String search(){
		
		this.zongJiLu=roleBiz.getZongJiLu(roleName);
		this.zongYe=this.zongJiLu/3;
		if(this.zongJiLu%3>0){
			this.zongYe+=1;
		}
		List list=roleBiz.rolefanYe(this.dangQianYe,roleName);
		ActionContext ac=ActionContext.getContext();
		ac.put("list", list);
		return this.SUCCESS;
}

	public String date(){
		

		return this.SUCCESS;
}
	
	public String goAddRole(){
		List list=roleBiz.getDept();
		Map map=new HashMap();
		for(Object obj:list){
		Dept d=(Dept)obj;	
		map.put(d.getId(), d.getDeptName());	
		}
		ActionContext.getContext().put("map", map);
		
		return this.SUCCESS;
	}
	
	public String addRole(){
		this.role.setLastTime(new Date());
		roleBiz.addRole(role);
		return this.SUCCESS;
	}
	
	public String goUpdateRole(){
//		System.out.println("得到id:"+role.getId());
		
		role=roleBiz.findRole(role.getId());
		List list=roleBiz.getDept();
		Map map=new HashMap();
		for(Object obj:list){
		Dept d=(Dept)obj;	
		map.put(d.getId(), d.getDeptName());	
		}
		ActionContext.getContext().put("map", map);
		return this.SUCCESS;
	}
	
	 public String goDeleteRole(){
		roleBiz.deleteRole(role);
		return this.SUCCESS;
	}
}
