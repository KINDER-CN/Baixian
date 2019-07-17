package com.zl.pojo.city;
/**
 * 区表
 * @author Administrator
 *
 */
public class District {
	private Integer id;//主键id
	private Integer disno;//区编号
	private String disName;//区名
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDisno() {
		return disno;
	}
	public void setDisno(Integer disno) {
		this.disno = disno;
	}
	public String getDisName() {
		return disName;
	}
	public void setDisName(String disName) {
		this.disName = disName;
	}
	@Override
	public String toString() {
		return "District [id=" + id + ", disno=" + disno + ", disName=" + disName + "]";
	}
	
}
