package com.zl.pojo.city;
/**
 * 省表实体类
 * @author Administrator
 *
 */
public class Province {
	private Integer id;//省表主键id
	private Integer prono;//省编号
	private String proname;//省名
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProno() {
		return prono;
	}
	public void setProno(Integer prono) {
		this.prono = prono;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", prono=" + prono + ", proname=" + proname + "]";
	}
}
