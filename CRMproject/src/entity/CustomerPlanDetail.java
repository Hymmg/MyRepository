package entity;

import java.util.Date;

/**
 * CustomerPlanDetail entity. @author MyEclipse Persistence Tools
 */

public class CustomerPlanDetail implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private String planName;
	private Date planDate;
	private String planStatus;
	private String planContent;
	private Date lastmodifiedTime;

	// Constructors

	/** default constructor */
	public CustomerPlanDetail() {
	}

	/** full constructor */
	public CustomerPlanDetail(Users users, String planName, Date planDate,
			String planStatus, String planContent, Date lastmodifiedTime) {
		this.users = users;
		this.planName = planName;
		this.planDate = planDate;
		this.planStatus = planStatus;
		this.planContent = planContent;
		this.lastmodifiedTime = lastmodifiedTime;
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

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Date getPlanDate() {
		return this.planDate;
	}

	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}

	public String getPlanStatus() {
		return this.planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getPlanContent() {
		return this.planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Date getLastmodifiedTime() {
		return this.lastmodifiedTime;
	}

	public void setLastmodifiedTime(Date lastmodifiedTime) {
		this.lastmodifiedTime = lastmodifiedTime;
	}

}