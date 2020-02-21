package com.accp.pojo;
/**
 * 部门表
 * @author ASUS
 *
 */
public class Department {
	/**
	 * 部门类型ID
	 */
	private Integer departmentId;
	/**
	 * 部门名称（如：总经理、财务部）
	 */
	private String departmentName;
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Department(Integer departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
}
