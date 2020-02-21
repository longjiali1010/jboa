package com.accp.pojo;
/**
 * 报销详情表
 * @author ASUS
 *
 */
public class Reimburse {
	/**
	 * 报销详情编号
	 */
	private Integer id;
	/**
	 * 报销主表编号
	 */
	private Integer mainId;
	/**
	 * 报销金额
	 */
	private float subTotal;
	/**
	 * 报销描述
	 */
	private String desc;
	/**
	 *图片路径
	 */
	private String pictureName;
	/**
	 *  图片真实保存路径
	 */
	private String picturePath;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMainId() {
		return mainId;
	}
	public void setMainId(Integer mainId) {
		this.mainId = mainId;
	}
	public float getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public String getPicturePath() {
		return picturePath;
	}
	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	public Reimburse(Integer id, Integer mainId, float subTotal, String desc, String pictureName, String picturePath) {
		super();
		this.id = id;
		this.mainId = mainId;
		this.subTotal = subTotal;
		this.desc = desc;
		this.pictureName = pictureName;
		this.picturePath = picturePath;
	}
	public Reimburse() {
		super();
	}
	@Override
	public String toString() {
		return "Reimburse [id=" + id + ", mainId=" + mainId + ", subTotal=" + subTotal + ", desc=" + desc
				+ ", pictureName=" + pictureName + ", picturePath=" + picturePath + "]";
	}
}
