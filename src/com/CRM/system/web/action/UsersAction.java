package com.CRM.system.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.CRM.system.model.biz.UsersBiz;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Dept;
import entity.Users;

public class UsersAction extends ActionSupport {

	private UsersBiz usersBiz;
	private Users users;
	private int dangQianYe = 1;
	private int zongYe = 0;
	private int zongJiLu = 0;

	private long messageUsersId;//根据messageUsersId登录员工id找到users
	private String messageloginName;//根据重新获取的登录名设置users
	private String oldPassword;//输入原密码
    public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	private String newPassword;//输入新密码
    private String newPasswordOk;//输入确认密码
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewPasswordOk() {
		return newPasswordOk;
	}

	public void setNewPasswordOk(String newPasswordOk) {
		this.newPasswordOk = newPasswordOk;
	}

	public String getMessageloginName() {
		return messageloginName;
	}

	public void setMessageloginName(String messageloginName) {
		this.messageloginName = messageloginName;
	}

	public long getMessageUsersId() {
		return messageUsersId;
	}

	public void setMessageUsersId(long messageUsersId) {
		this.messageUsersId = messageUsersId;
	}

	public int getZongJiLu() {
		return zongJiLu;
	}

	public void setZongJiLu(int zongJiLu) {
		this.zongJiLu = zongJiLu;
	}

	public UsersBiz getUsersBiz() {
		return usersBiz;
	}

	public void setUsersBiz(UsersBiz usersBiz) {
		this.usersBiz = usersBiz;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
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

	
	
	

	
	
	public String usersfenYe() {
		// System.out.println("进入没有条件的分页方法");
		this.zongJiLu = usersBiz.getZongJiLu();
		this.zongYe = this.zongJiLu / 3;
		if (this.zongJiLu % 3 > 0) {
			this.zongYe += 1;
		}

		List list = usersBiz.usersfanYe(this.dangQianYe);
		ActionContext ac = ActionContext.getContext();
		ac.put("list", list);
		return this.SUCCESS;
	}

	public String userssearch() {

		this.zongJiLu = usersBiz.getZongJiLu(users);
		this.zongYe = this.zongJiLu / 3;
		if (this.zongJiLu % 3 > 0) {
			this.zongYe += 1;
		}
		List list = usersBiz.usersfanYe(this.dangQianYe, users);

		ActionContext ac = ActionContext.getContext();
		ac.put("list", list);
		return this.SUCCESS;
	}

	public String goAddUsers() {
		List list = usersBiz.getDept();
		Map map = new HashMap();
		for (Object obj : list) {
			Dept d = (Dept) obj;
			map.put(d.getId(), d.getDeptName());
		}
		ActionContext.getContext().put("map", map);

		return this.SUCCESS;
	}

	public String addUsers() {
		this.users.setLastTime(new Date());
		usersBiz.addUsers(users);
		return this.SUCCESS;
	}

	public String goUpdateUsers() {

		users = usersBiz.findUsers(users.getId());
		List list = usersBiz.getDept();
		Map map = new HashMap();
		for (Object obj : list) {
			Dept d = (Dept) obj;
			map.put(d.getId(), d.getDeptName());
		}
		ActionContext.getContext().put("map", map);
		return this.SUCCESS;
	}

	public String goDeleteUsers() {
		usersBiz.deleteUsers(users);
		return this.SUCCESS;
	}
	
	public String goMessageUsers(){
		return this.SUCCESS;
				
	}
	
	public String messageName(){
		Users u=usersBiz.findUsers(messageUsersId);//想根据传过来的登录名找到那个用户
		u.setLoginName(messageloginName);
		usersBiz.addUsers(u);
		ActionContext ac = ActionContext.getContext();
		ac.put("error","登录名修改成功，请重新登陆");
		return this.SUCCESS;
				
	}
	
	public String goMessagePassword(){
		
		return this.SUCCESS;
	}
	
	public String messagePassword(){
		Users u=usersBiz.findUsers(messageUsersId);//想根据传过来的登录名找到那个用户
		ActionContext ac = ActionContext.getContext();
		if(oldPassword==null||"".equals(oldPassword)){
			ac.put("error","对不起，您还没有输入原始密码");
			return this.ERROR;
		}
		if(!u.getLoginPassword().equals(oldPassword)){
				ac.put("error","对不起，原始密码错误，请重新输入");
				return this.ERROR;
			}
		if(newPassword==null||"".equals(newPassword)){
			ac.put("error","对不起，您还没有输入新密码");
			return this.ERROR;
		}
		if(newPasswordOk==null||"".equals(newPasswordOk)){
			ac.put("error","对不起，您还没有输入确认密码");
			return this.ERROR;
		}	
	   else if(!newPasswordOk.equals(newPassword)){
			ac.put("error","对不起两次密码输入不一致，请重新输入");
			return this.ERROR;
		}else{
		    u.setLoginPassword(newPassword);
		    usersBiz.addUsers(u);
		    ac.put("error","密码修改成功，请重新登陆");
		}
		return this.SUCCESS;
		
		
	}
	
	
	
}
