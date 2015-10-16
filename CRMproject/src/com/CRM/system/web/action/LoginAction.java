package com.CRM.system.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.CRM.system.model.biz.UsersBiz;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Users;


public class LoginAction extends ActionSupport {


	private UsersBiz usersBiz;

	private String name;





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




	private String password;


	

	public String login() throws Exception {

		ActionContext ac = ActionContext.getContext();
		Users users = new Users();
		users.setLoginName(name);
		users.setLoginPassword(password);
        System.out.println(users.getLoginName());
        System.out.println(users.getLoginPassword());
		int res = usersBiz.login(users);

		if (res == 2) {

			ac.put("error",this.getText("zhcw"));
			return this.ERROR;
		} else if (res == 3) {
			ac.put("error", this.getText("mmcw"));
			return this.ERROR;
		}
	
		ac.getSession().put("us", users);
		return this.SUCCESS;

	}
}
