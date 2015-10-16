package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Long id;
	private String deptName;
	private Set roles = new HashSet(0);
	private Set salesAnalysises = new HashSet(0);
	private Set userses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(String deptName) {
		this.deptName = deptName;
	}

	/** full constructor */
	public Dept(String deptName, Set roles, Set salesAnalysises, Set userses) {
		this.deptName = deptName;
		this.roles = roles;
		this.salesAnalysises = salesAnalysises;
		this.userses = userses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set getRoles() {
		return this.roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	public Set getSalesAnalysises() {
		return this.salesAnalysises;
	}

	public void setSalesAnalysises(Set salesAnalysises) {
		this.salesAnalysises = salesAnalysises;
	}

	public Set getUserses() {
		return this.userses;
	}

	public void setUserses(Set userses) {
		this.userses = userses;
	}

}