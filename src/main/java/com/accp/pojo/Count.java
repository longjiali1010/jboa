package com.accp.pojo;
/**
 * 统计表
 * @author ASUS
 *
 */
public class Count {
	/**
	 * 统计编号
	 */
	private Integer countId;
	/**
	 * 统计金额
	 */
	private float money;
	/**
	 * 统计年份
	 */
	private Integer year;
	/**
	 * 统计月份
	 */
	private Integer month;
	/**
	 * 统计部门
	 */
	private Integer departmentId;
	/**
	 * 统计员工编号
	 */
	private Integer employeeId;
	/**
	 * （部门名称）
	 */
	private String departmentName;
	/**
	 * （员工名称）
	 */
	private String employeeName;
	public Integer getCountId() {
		return countId;
	}
	public void setCountId(Integer countId) {
		this.countId = countId;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Count(Integer countId, float money, Integer year, Integer month, Integer departmentId, Integer employeeId,
			String departmentName, String employeeName) {
		super();
		this.countId = countId;
		this.money = money;
		this.year = year;
		this.month = month;
		this.departmentId = departmentId;
		this.employeeId = employeeId;
		this.departmentName = departmentName;
		this.employeeName = employeeName;
	}
	public Count() {
		super();
	}
	@Override
	public String toString() {
		return "Count [countId=" + countId + ", money=" + money + ", year=" + year + ", month=" + month
				+ ", departmentId=" + departmentId + ", employeeId=" + employeeId + ", departmentName=" + departmentName
				+ ", employeeName=" + employeeName + "]";
	}
}
