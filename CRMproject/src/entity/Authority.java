package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields

	private Long id;
	private String authority;
	private Set roleAuthorities = new HashSet(0);

	// Constructors

	/** default constructor */
	public Authority() {
	}

	/** minimal constructor */
	public Authority(String authority) {
		this.authority = authority;
	}

	/** full constructor */
	public Authority(String authority, Set roleAuthorities) {
		this.authority = authority;
		this.roleAuthorities = roleAuthorities;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Set getRoleAuthorities() {
		return this.roleAuthorities;
	}

	public void setRoleAuthorities(Set roleAuthorities) {
		this.roleAuthorities = roleAuthorities;
	}

}