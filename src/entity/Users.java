package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Long id;
	private Users usersByManagerId;
	private Users usersByCreateuserId;
	private Dept dept;
	private String loginName;
	private String loginPassword;
	private String employeName;
	private String status;
	private String sex;
	private String remark;
	private Date lastTime;
	private Set roles = new HashSet(0);
	private Set serviceInfosForUsersOperateId = new HashSet(0);
	private Set commonProblems = new HashSet(0);
	private Set usersesForCreateuserId = new HashSet(0);
	private Set usersesForManagerId = new HashSet(0);
	private Set roles_1 = new HashSet(0);
	private Set serviceInfosForUsersAllocateId = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(Users usersByManagerId, Users usersByCreateuserId, Dept dept,
			String loginName, String loginPassword, String employeName,
			String status, String sex, String remark, Date lastTime, Set roles,
			Set serviceInfosForUsersOperateId, Set commonProblems,
			Set usersesForCreateuserId, Set usersesForManagerId, Set roles_1,
			Set serviceInfosForUsersAllocateId) {
		this.usersByManagerId = usersByManagerId;
		this.usersByCreateuserId = usersByCreateuserId;
		this.dept = dept;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.employeName = employeName;
		this.status = status;
		this.sex = sex;
		this.remark = remark;
		this.lastTime = lastTime;
		this.roles = roles;
		this.serviceInfosForUsersOperateId = serviceInfosForUsersOperateId;
		this.commonProblems = commonProblems;
		this.usersesForCreateuserId = usersesForCreateuserId;
		this.usersesForManagerId = usersesForManagerId;
		this.roles_1 = roles_1;
		this.serviceInfosForUsersAllocateId = serviceInfosForUsersAllocateId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUsersByManagerId() {
		return this.usersByManagerId;
	}

	public void setUsersByManagerId(Users usersByManagerId) {
		this.usersByManagerId = usersByManagerId;
	}

	public Users getUsersByCreateuserId() {
		return this.usersByCreateuserId;
	}

	public void setUsersByCreateuserId(Users usersByCreateuserId) {
		this.usersByCreateuserId = usersByCreateuserId;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getEmployeName() {
		return this.employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	public Set getServiceInfosForUsersOperateId() {
		return this.serviceInfosForUsersOperateId;
	}

	public void setServiceInfosForUsersOperateId(
			Set serviceInfosForUsersOperateId) {
		this.serviceInfosForUsersOperateId = serviceInfosForUsersOperateId;
	}

	public Set getCommonProblems() {
		return this.commonProblems;
	}

	public void setCommonProblems(Set commonProblems) {
		this.commonProblems = commonProblems;
	}

	public Set getUsersesForCreateuserId() {
		return this.usersesForCreateuserId;
	}

	public void setUsersesForCreateuserId(Set usersesForCreateuserId) {
		this.usersesForCreateuserId = usersesForCreateuserId;
	}

	public Set getUsersesForManagerId() {
		return this.usersesForManagerId;
	}

	public void setUsersesForManagerId(Set usersesForManagerId) {
		this.usersesForManagerId = usersesForManagerId;
	}

	public Set getRoles_1() {
		return this.roles_1;
	}

	public void setRoles_1(Set roles_1) {
		this.roles_1 = roles_1;
	}

	public Set getServiceInfosForUsersAllocateId() {
		return this.serviceInfosForUsersAllocateId;
	}

	public void setServiceInfosForUsersAllocateId(
			Set serviceInfosForUsersAllocateId) {
		this.serviceInfosForUsersAllocateId = serviceInfosForUsersAllocateId;
	}

}