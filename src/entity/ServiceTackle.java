package entity;

/**
 * ServiceTackle entity. @author MyEclipse Persistence Tools
 */

public class ServiceTackle implements java.io.Serializable {

	// Fields

	private Long id;
	private ServiceInfo serviceInfo;
	private String tackleResult;
	private String tackleInstruction;

	// Constructors

	/** default constructor */
	public ServiceTackle() {
	}

	/** full constructor */
	public ServiceTackle(ServiceInfo serviceInfo, String tackleResult,
			String tackleInstruction) {
		this.serviceInfo = serviceInfo;
		this.tackleResult = tackleResult;
		this.tackleInstruction = tackleInstruction;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ServiceInfo getServiceInfo() {
		return this.serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public String getTackleResult() {
		return this.tackleResult;
	}

	public void setTackleResult(String tackleResult) {
		this.tackleResult = tackleResult;
	}

	public String getTackleInstruction() {
		return this.tackleInstruction;
	}

	public void setTackleInstruction(String tackleInstruction) {
		this.tackleInstruction = tackleInstruction;
	}

}