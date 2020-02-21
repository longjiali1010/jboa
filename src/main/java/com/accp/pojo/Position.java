package com.accp.pojo;
/**
 * 员工职务表
 * @author ASUS
 *
 */
public class Position {
	/**
	 * 员工职务ID
	 */
	private Integer positionId;
	/**
	 * 职务名称（如：总经理、部门经理）
	 */
	private String positionName;
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Position(Integer positionId, String positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}
	public Position() {
		super();
	}
	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + "]";
	}
}
