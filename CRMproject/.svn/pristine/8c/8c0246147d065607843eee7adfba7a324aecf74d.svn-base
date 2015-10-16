package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private Dept dept;
	private String roleName;
	private Date lastTime;
	private String remark;
	private Set roleAuthorities = new HashSet(0);
	private Set userRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(Users users, Dept dept, String roleName, Date lastTime,
			String remark, Set roleAuthorities, Set userRoles) {
		this.users = users;
		this.dept = dept;
		this.roleName = roleName;
		this.lastTime = lastTime;
		this.remark = remark;
		this.roleAuthorities = roleAuthorities;
		this.userRoles = userRoles;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getRoleAuthorities() {
		return this.roleAuthorities;
	}

	public void setRoleAuthorities(Set roleAuthorities) {
		this.roleAuthorities = roleAuthorities;
	}

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

}