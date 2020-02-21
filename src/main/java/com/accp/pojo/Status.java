package com.accp.pojo;
/**
 * 状态表
 * @author ASUS
 *
 */
public class Status {
	/**
	 * 状态编号
	 */
	private Integer statusId;
	/**
	 * 状态名称（如：1新创建2待审批3审批中4已审批5已付款6已打回7已存档）
	 */
	private String statusName;
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Status(Integer statusId, String statusName) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
	}
	public Status() {
		super();
	}
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusName=" + statusName + "]";
	}
}
