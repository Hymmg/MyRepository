package entity;

/**
 * ServiceFeedback entity. @author MyEclipse Persistence Tools
 */

public class ServiceFeedback implements java.io.Serializable {

	// Fields

	private Long id;
	private ServiceInfo serviceInfo;
	private String feedbackResult;
	private String feedbackInstruction;

	// Constructors

	/** default constructor */
	public ServiceFeedback() {
	}

	/** full constructor */
	public ServiceFeedback(ServiceInfo serviceInfo, String feedbackResult,
			String feedbackInstruction) {
		this.serviceInfo = serviceInfo;
		this.feedbackResult = feedbackResult;
		this.feedbackInstruction = feedbackInstruction;
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

	public String getFeedbackResult() {
		return this.feedbackResult;
	}

	public void setFeedbackResult(String feedbackResult) {
		this.feedbackResult = feedbackResult;
	}

	public String getFeedbackInstruction() {
		return this.feedbackInstruction;
	}

	public void setFeedbackInstruction(String feedbackInstruction) {
		this.feedbackInstruction = feedbackInstruction;
	}

}