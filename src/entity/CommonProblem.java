package entity;

import java.util.Date;

/**
 * CommonProblem entity. @author MyEclipse Persistence Tools
 */

public class CommonProblem implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private String proType;
	private String proTitle;
	private String ansKey;
	private String beiZhu;
	private Date lastTime;

	// Constructors

	/** default constructor */
	public CommonProblem() {
	}

	/** full constructor */
	public CommonProblem(Users users, String proType, String proTitle,
			String ansKey, String beiZhu, Date lastTime) {
		this.users = users;
		this.proType = proType;
		this.proTitle = proTitle;
		this.ansKey = ansKey;
		this.beiZhu = beiZhu;
		this.lastTime = lastTime;
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

	public String getProType() {
		return this.proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public String getProTitle() {
		return this.proTitle;
	}

	public void setProTitle(String proTitle) {
		this.proTitle = proTitle;
	}

	public String getAnsKey() {
		return this.ansKey;
	}

	public void setAnsKey(String ansKey) {
		this.ansKey = ansKey;
	}

	public String getBeiZhu() {
		return this.beiZhu;
	}

	public void setBeiZhu(String beiZhu) {
		this.beiZhu = beiZhu;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

}