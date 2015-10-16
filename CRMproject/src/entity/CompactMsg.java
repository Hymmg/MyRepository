package entity;

import java.util.Date;

/**
 * CompactMsg entity. @author MyEclipse Persistence Tools
 */

public class CompactMsg implements java.io.Serializable {

	// Fields

	private Long id;
	private Users users;
	private CustomerInfo customerInfoByPart2Id;
	private CustomerInfo customerInfoByPart1Id;
	private String compactName;
	private String compactType;
	private Double money;
	private String content;
	private String remark;
	private String status;
	private Date lastTime;

	// Constructors

	/** default constructor */
	public CompactMsg() {
	}

	/** full constructor */
	public CompactMsg(Users users, CustomerInfo customerInfoByPart2Id,
			CustomerInfo customerInfoByPart1Id, String compactName,
			String compactType, Double money, String content, String remark,
			String status, Date lastTime) {
		this.users = users;
		this.customerInfoByPart2Id = customerInfoByPart2Id;
		this.customerInfoByPart1Id = customerInfoByPart1Id;
		this.compactName = compactName;
		this.compactType = compactType;
		this.money = money;
		this.content = content;
		this.remark = remark;
		this.status = status;
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

	public CustomerInfo getCustomerInfoByPart2Id() {
		return this.customerInfoByPart2Id;
	}

	public void setCustomerInfoByPart2Id(CustomerInfo customerInfoByPart2Id) {
		this.customerInfoByPart2Id = customerInfoByPart2Id;
	}

	public CustomerInfo getCustomerInfoByPart1Id() {
		return this.customerInfoByPart1Id;
	}

	public void setCustomerInfoByPart1Id(CustomerInfo customerInfoByPart1Id) {
		this.customerInfoByPart1Id = customerInfoByPart1Id;
	}

	public String getCompactName() {
		return this.compactName;
	}

	public void setCompactName(String compactName) {
		this.compactName = compactName;
	}

	public String getCompactType() {
		return this.compactType;
	}

	public void setCompactType(String compactType) {
		this.compactType = compactType;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

}