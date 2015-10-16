package entity;

import java.sql.Timestamp;

/**
 * SalesPerformances entity. @author MyEclipse Persistence Tools
 */

public class SalesPerformances implements java.io.Serializable {

	// Fields

	private Long id;
	private Users usersByUserId;
	private Users usersByStaffId;
	private Integer performanceGrade;
	private Timestamp lastModofyTime;
	private String comment;
	private Timestamp lastTime;

	// Constructors

	/** default constructor */
	public SalesPerformances() {
	}

	/** minimal constructor */
	public SalesPerformances(Integer performanceGrade, Timestamp lastModofyTime) {
		this.performanceGrade = performanceGrade;
		this.lastModofyTime = lastModofyTime;
	}

	/** full constructor */
	public SalesPerformances(Users usersByUserId, Users usersByStaffId,
			Integer performanceGrade, Timestamp lastModofyTime, String comment,
			Timestamp lastTime) {
		this.usersByUserId = usersByUserId;
		this.usersByStaffId = usersByStaffId;
		this.performanceGrade = performanceGrade;
		this.lastModofyTime = lastModofyTime;
		this.comment = comment;
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

	public Users getUsersByStaffId() {
		return this.usersByStaffId;
	}

	public void setUsersByStaffId(Users usersByStaffId) {
		this.usersByStaffId = usersByStaffId;
	}

	public Integer getPerformanceGrade() {
		return this.performanceGrade;
	}

	public void setPerformanceGrade(Integer performanceGrade) {
		this.performanceGrade = performanceGrade;
	}

	public Timestamp getLastModofyTime() {
		return this.lastModofyTime;
	}

	public void setLastModofyTime(Timestamp lastModofyTime) {
		this.lastModofyTime = lastModofyTime;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

}