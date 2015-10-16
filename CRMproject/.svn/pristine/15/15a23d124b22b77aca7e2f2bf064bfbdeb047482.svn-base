package entity;

import java.sql.Timestamp;

/**
 * SalesPlans entity. @author MyEclipse Persistence Tools
 */

public class SalesPlans implements java.io.Serializable {

	// Fields

	private Long id;
	private Users usersByUserId;
	private Users usersByDealId;
	private SalesOpportunities salesOpportunities;
	private Users usersByMakerId;
	private String planContent;
	private Timestamp makeTime;
	private Timestamp planTime;
	private String planStauts;
	private Timestamp lastTime;

	// Constructors

	/** default constructor */
	public SalesPlans() {
	}

	/** minimal constructor */
	public SalesPlans(Users usersByDealId, Timestamp planTime) {
		this.usersByDealId = usersByDealId;
		this.planTime = planTime;
	}

	/** full constructor */
	public SalesPlans(Users usersByUserId, Users usersByDealId,
			SalesOpportunities salesOpportunities, Users usersByMakerId,
			String planContent, Timestamp makeTime, Timestamp planTime,
			String planStauts, Timestamp lastTime) {
		this.usersByUserId = usersByUserId;
		this.usersByDealId = usersByDealId;
		this.salesOpportunities = salesOpportunities;
		this.usersByMakerId = usersByMakerId;
		this.planContent = planContent;
		this.makeTime = makeTime;
		this.planTime = planTime;
		this.planStauts = planStauts;
		this.lastTime = lastTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUsersByUserId() {
		return this.usersByUserId;
	}

	public void setUsersByUserId(Users usersByUserId) {
		this.usersByUserId = usersByUserId;
	}

	public Users getUsersByDealId() {
		return this.usersByDealId;
	}

	public void setUsersByDealId(Users usersByDealId) {
		this.usersByDealId = usersByDealId;
	}

	public SalesOpportunities getSalesOpportunities() {
		return this.salesOpportunities;
	}

	public void setSalesOpportunities(SalesOpportunities salesOpportunities) {
		this.salesOpportunities = salesOpportunities;
	}

	public Users getUsersByMakerId() {
		return this.usersByMakerId;
	}

	public void setUsersByMakerId(Users usersByMakerId) {
		this.usersByMakerId = usersByMakerId;
	}

	public String getPlanContent() {
		return this.planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Timestamp getMakeTime() {
		return this.makeTime;
	}

	public void setMakeTime(Timestamp makeTime) {
		this.makeTime = makeTime;
	}

	public Timestamp getPlanTime() {
		return this.planTime;
	}

	public void setPlanTime(Timestamp planTime) {
		this.planTime = planTime;
	}

	public String getPlanStauts() {
		return this.planStauts;
	}

	public void setPlanStauts(String planStauts) {
		this.planStauts = planStauts;
	}

	public Timestamp getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

}