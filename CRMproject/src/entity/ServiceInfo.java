package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ServiceInfo entity. @author MyEclipse Persistence Tools
 */

public class ServiceInfo implements java.io.Serializable {

	// Fields

	private Long id;
	private Users usersByUsersOperateId;
	private Users usersByUsersAllocateId;
	private String serviceType;
	private String serviceName;
	private String serviceContent;
	private String customerName;
	private String customerTel;
	private String beiZhu;
	private String serviceStatus;
	private Date lastTime;
	private Set serviceTackles = new HashSet(0);
	private Set salesOpportunitieses = new HashSet(0);
	private Set serviceFeedbacks = new HashSet(0);

	// Constructors

	/** default constructor */
	public ServiceInfo() {
	}

	/** full constructor */
	public ServiceInfo(Users usersByUsersOperateId,
			Users usersByUsersAllocateId, String serviceType,
			String serviceName, String serviceContent, String customerName,
			String customerTel, String beiZhu, String serviceStatus,
			Date lastTime, Set serviceTackles, Set salesOpportunitieses,
			Set serviceFeedbacks) {
		this.usersByUsersOperateId = usersByUsersOperateId;
		this.usersByUsersAllocateId = usersByUsersAllocateId;
		this.serviceType = serviceType;
		this.serviceName = serviceName;
		this.serviceContent = serviceContent;
		this.customerName = customerName;
		this.customerTel = customerTel;
		this.beiZhu = beiZhu;
		this.serviceStatus = serviceStatus;
		this.lastTime = lastTime;
		this.serviceTackles = serviceTackles;
		this.salesOpportunitieses = salesOpportunitieses;
		this.serviceFeedbacks = serviceFeedbacks;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUsersByUsersOperateId() {
		return this.usersByUsersOperateId;
	}

	public void setUsersByUsersOperateId(Users usersByUsersOperateId) {
		this.usersByUsersOperateId = usersByUsersOperateId;
	}

	public Users getUsersByUsersAllocateId() {
		return this.usersByUsersAllocateId;
	}

	public void setUsersByUsersAllocateId(Users usersByUsersAllocateId) {
		this.usersByUsersAllocateId = usersByUsersAllocateId;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceContent() {
		return this.serviceContent;
	}

	public void setServiceContent(String serviceContent) {
		this.serviceContent = serviceContent;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerTel() {
		return this.customerTel;
	}

	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	public String getBeiZhu() {
		return this.beiZhu;
	}

	public void setBeiZhu(String beiZhu) {
		this.beiZhu = beiZhu;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public Set getServiceTackles() {
		return this.serviceTackles;
	}

	public void setServiceTackles(Set serviceTackles) {
		this.serviceTackles = serviceTackles;
	}

	public Set getSalesOpportunitieses() {
		return this.salesOpportunitieses;
	}

	public void setSalesOpportunitieses(Set salesOpportunitieses) {
		this.salesOpportunitieses = salesOpportunitieses;
	}

	public Set getServiceFeedbacks() {
		return this.serviceFeedbacks;
	}

	public void setServiceFeedbacks(Set serviceFeedbacks) {
		this.serviceFeedbacks = serviceFeedbacks;
	}

}