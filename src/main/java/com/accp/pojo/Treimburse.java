package com.accp.pojo;
/**
 * 报销主表
 * @author ASUS
 *
 */
public class Treimburse {
	/**
	 * 报销编号
	 */
	private Integer reimburseId;
	/**
	 * 报销类型（默认为2）
	 */
	private Integer typeId;
	/**
	 * 报销人编号
	 */
	private Integer createMan;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 部门编号
	 */
	private Integer departmentId;
	/**
	 * 下一个处理人
	 */
	private Integer nextDealMan;
	/**
	 * 报销理由
	 */
	private String event;
	/**
	 * 报销金额
	 */
	private float totalCount;
	/**
	 * 状态（如：1新创建2待审批3审批中4已审批5已付款6已打回7已存档）
	 */
	private Integer statusId;
	public Integer getReimburseId() {
		return reimburseId;
	}
	public void setReimburseId(Integer reimburseId) {
		this.reimburseId = reimburseId;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
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
	public float getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(float totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Treimburse(Integer reimburseId, Integer typeId, Integer createMan, String createTime, Integer departmentId,
			Integer nextDealMan, String event, float totalCount, Integer statusId) {
		super();
		this.reimburseId = reimburseId;
		this.typeId = typeId;
		this.createMan = createMan;
		this.createTime = createTime;
		this.departmentId = departmentId;
		this.nextDealMan = nextDealMan;
		this.event = event;
		this.totalCount = totalCount;
		this.statusId = statusId;
	}
	public Treimburse() {
		super();
	}
	@Override
	public String toString() {
		return "Treimburse [reimburseId=" + reimburseId + ", typeId=" + typeId + ", createMan=" + createMan
				+ ", createTime=" + createTime + ", departmentId=" + departmentId + ", nextDealMan=" + nextDealMan
				+ ", event=" + event + ", totalCount=" + totalCount + ", statusId=" + statusId + "]";
	}
}
