package com.CRM.system.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.CRM.system.model.biz.UsersBiz;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Role;
import entity.Users;




public class LoginAction extends ActionSupport {


	private UsersBiz usersBiz;
	private String name;//登录名
	private String password;//登录密码





	public UsersBiz getUsersBiz() {
		return usersBiz;
	}




	public void setUsersBiz(UsersBiz usersBiz) {
		this.usersBiz = usersBiz;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}

	public Users getUsersByloginName(String name){
		return usersBiz.getUsersByloginName(name);
	}

	public String login() throws Exception {
		ActionContext ac = ActionContext.getContext();
		Users users = new Users();
		users.setLoginName(name);
		users.setLoginPassword(password);
		int res = usersBiz.login(users);

		if (res == 2) {
			ac.put("error",this.getText("zhcw"));
			return this.ERROR;
		} else if (res == 3) {
			ac.put("error", this.getText("mmcw"));
			return this.ERROR;
		}
	
		ac.getSession().put("us", users);
		ac.getSession().put("loginName", name);
		
		
//		Users usersLogin=this.getUsersByloginName(name);
//		System.out.println(usersLogin.getId());
//		for(int i=0;i<usersLogin.getRoles_1().size();i++){
//		//	System.out.println(((Role)usersLogin.getRoles_1()).getId());
//		}
//		System.out.println(usersLogin.getId());
//		System.out.println(usersLogin.getDept().getDeptName());
		//不能得到员工role的信息，不理解啊啊啊啊啊
		
		
		ac.getSession().put("usersLogin", this.getUsersByloginName(name));
		
		ac.getSession().put("usersId", this.getUsersByloginName(name).getId());
		return this.SUCCESS;

	}

	
	
}
