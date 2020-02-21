package com.accp.pojo;
/**
 * 审核类型表
 * @author ASUS
 *
 */
public class Result {
	/**
	 * 审核类型ID
	 */
	private Integer resultId;
	/**
	 * 审核结果名称
	 */
	private String resultName;
	public Integer getResultId() {
		return resultId;
	}
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}
	public String getResultName() {
		return resultName;
	}
	public void setResultName(String resultName) {
		this.resultName = resultName;
	}
	public Result(Integer resultId, String resultName) {
		super();
		this.resultId = resultId;
		this.resultName = resultName;
	}
	public Result() {
		super();
	}
	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", resultName=" + resultName + "]";
	}
}
