package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * CustomerDistrict entity. @author MyEclipse Persistence Tools
 */

public class CustomerDistrict implements java.io.Serializable {

	// Fields

	private Long id;
	private String districtName;
	private Set customerInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public CustomerDistrict() {
	}

	/** full constructor */
	public CustomerDistrict(String districtName, Set customerInfos) {
		this.districtName = districtName;
		this.customerInfos = customerInfos;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Set getCustomerInfos() {
		return this.customerInfos;
	}

	public void setCustomerInfos(Set customerInfos) {
		this.customerInfos = customerInfos;
	}

}