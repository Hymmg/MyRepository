package entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * SalesOpportunities entity. @author MyEclipse Persistence Tools
 */

public class SalesOpportunities implements java.io.Serializable {

	// Fields

	private Long id;
	private CustomerInfo customerInfo;
	private ServiceInfo serviceInfo;
	private Users users;
	private String customerName;
	private String chanceSource;
	private String telephone;
	private Long successProbalility;
	private String summary;
	private Long opportunityDescription;
	private Timestamp assignTime;
	private String status;
	private Set salesPlanses = new HashSet(0);

	// Constructors

	/** default constructor */
	public SalesOpportunities() {
	}

	/** full constructor */
	public SalesOpportunities(CustomerInfo customerInfo,
			ServiceInfo serviceInfo, Users users, String customerName,
			String chanceSource, String telephone, Long successProbalility,
			String summary, Long opportunityDescription, Timestamp assignTime,
			String status, Set salesPlanses) {
		this.customerInfo = customerInfo;
		this.serviceInfo = serviceInfo;
		this.users = users;
		this.customerName = customerName;
		this.chanceSource = chanceSource;
		this.telephone = telephone;
		this.successProbalility = successProbalility;
		this.summary = summary;
		this.opportunityDescription = opportunityDescription;
		this.assignTime = assignTime;
		this.status = status;
		this.salesPlanses = salesPlanses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerInfo getCustomerInfo() {
		return this.customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public ServiceInfo getServiceInfo() {
		return this.serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getChanceSource() {
		return this.chanceSource;
	}

	public void setChanceSource(String chanceSource) {
		this.chanceSource = chanceSource;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getSuccessProbalility() {
		return this.successProbalility;
	}

	public void setSuccessProbalility(Long successProbalility) {
		this.successProbalility = successProbalility;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Long getOpportunityDescription() {
		return this.opportunityDescription;
	}

	public void setOpportunityDescription(Long opportunityDescription) {
		this.opportunityDescription = opportunityDescription;
	}

	public Timestamp getAssignTime() {
		return this.assignTime;
	}

	public void setAssignTime(Timestamp assignTime) {
		this.assignTime = assignTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getSalesPlanses() {
		return this.salesPlanses;
	}

	public void setSalesPlanses(Set salesPlanses) {
		this.salesPlanses = salesPlanses;
	}

}