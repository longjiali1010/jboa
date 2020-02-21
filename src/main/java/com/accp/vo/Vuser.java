package com.accp.vo;

public class Vuser {
	/**
	 * 员工编号
	 */
	private Integer employeeId;
	/**
	 * 员工姓名
	 */
	private String employeeName;
	/**
	 * 员工密码
	 */
	private String password;
	/**
	 * 员工所属部门ID（如：总经理、财务部）
	 */
	private Integer departmentId;
	/**
	 * 员工所属职务ID（如：总经理、部门经理）
	 */
	private Integer positionId;
	/**
	 * （暂无介绍）
	 */
	private Integer pId;
	/**
	 * 员工状态
	 */
	private String status;
	/**
	 * 职务名称（如：总经理、部门经理）
	 */
	private String positionName;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Vuser(Integer employeeId, String employeeName, String password, Integer departmentId, Integer positionId,
			Integer pId, String status, String positionName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.password = password;
		this.departmentId = departmentId;
		this.positionId = positionId;
		this.pId = pId;
		this.status = status;
		this.positionName = positionName;
	}
	public Vuser() {
		super();
	}
	@Override
	public String toString() {
		return "Vuser [employeeId=" + employeeId + ", employeeName=" + employeeName + ", password=" + password
				+ ", departmentId=" + departmentId + ", positionId=" + positionId + ", pId=" + pId + ", status="
				+ status + ", positionName=" + positionName + "]";
	}
}
