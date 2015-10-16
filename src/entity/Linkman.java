package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Linkman entity. @author MyEclipse Persistence Tools
 */

public class Linkman implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Date birthdate;
	private String sex;
	private String officeTelephone;
	private String email;
	private String address;
	private String mobilephone;
	private String remark;
	private Set customerInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Linkman() {
	}

	/** full constructor */
	public Linkman(String name, Date birthdate, String sex,
			String officeTelephone, String email, String address,
			String mobilephone, String remark, Set customerInfos) {
		this.name = name;
		this.birthdate = birthdate;
		this.sex = sex;
		this.officeTelephone = officeTelephone;
		this.email = email;
		this.address = address;
		this.mobilephone = mobilephone;
		this.remark = remark;
		this.customerInfos = customerInfos;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getOfficeTelephone() {
		return this.officeTelephone;
	}

	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getCustomerInfos() {
		return this.customerInfos;
	}

	public void setCustomerInfos(Set customerInfos) {
		this.customerInfos = customerInfos;
	}

}