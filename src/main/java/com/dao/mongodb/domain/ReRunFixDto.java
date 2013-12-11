package com.dao.mongodb.domain;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reRunFix")
public class ReRunFixDto {
	private String id;
	private String hdfsPath;
	private String workflowId;
	private String workFlowName;
	private Date createDate;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHdfsPath() {
		return hdfsPath;
	}
	public void setHdfsPath(String hdfsPath) {
		this.hdfsPath = hdfsPath;
	}
	public String getWorkflowId() {
		return workflowId;
	}
	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}
	public String getWorkFlowName() {
		return workFlowName;
	}
	public void setWorkFlowName(String workFlowName) {
		this.workFlowName = workFlowName;
	}
}
