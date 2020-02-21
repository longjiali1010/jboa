package com.accp.pojo;
/**
 * 请假表
 * @author ASUS
 *
 */
public class Leave {
	/**
	 * 请假编号
	 */
	private Integer leaveId;
	/**
	 * 请假类型（默认为1）
	 */
	private Integer typeId;
	/**
	 * 员工编号
	 */
	private Integer createMan;
	/**
	 * 请假人部门编号
	 */
	private Integer departmentId;
	/**
	 *请假条创建时间
	 */
	private String createTime;
	/**
	 *  请假开始日期
	 */
	private String startTime;
	/**
	 * 请假结束日期
	 */
	private String endTime;
	/**
	 * 下一个处理人
	 */
	private Integer nextDealMan;
	/**
	 * 请假理由
	 */
	private String event;
	/**
	 * 请假总天数
	 */
	private Integer totalCount;
	/**
	 * 状态编号（如：1新创建2待审批3审批中4已审批5已付款6已打回7已存档）
	 */
	private Integer statusId;
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getCreateMan() {
		return createMan;
	}
	public void setCreateMan(Integer createMan) {
		this.createMan = createMan;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getNextDealMan() {
		return nextDealMan;
	}
	public void setNextDealMan(Integer nextDealMan) {
		this.nextDealMan = nextDealMan;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Leave(Integer leaveId, Integer typeId, Integer createMan, Integer departmentId, String createTime,
			String startTime, String endTime, Integer nextDealMan, String event, Integer totalCount, Integer statusId) {
		super();
		this.leaveId = leaveId;
		this.typeId = typeId;
		this.createMan = createMan;
		this.departmentId = departmentId;
		this.createTime = createTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.nextDealMan = nextDealMan;
		this.event = event;
		this.totalCount = totalCount;
		this.statusId = statusId;
	}
	public Leave() {
		super();
	}
	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", typeId=" + typeId + ", createMan=" + createMan + ", departmentId="
				+ departmentId + ", createTime=" + createTime + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", nextDealMan=" + nextDealMan + ", event=" + event + ", totalCount=" + totalCount + ", statusId="
				+ statusId + "]";
	}
}
