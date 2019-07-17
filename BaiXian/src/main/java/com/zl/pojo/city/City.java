package com.zl.pojo.city;
/**
 * 市表
 * @author Administrator
 *
 */
public class City {
	private Integer id;//主键id
	private Integer cityno;//城市编号
	private String cityName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCityno() {
		return cityno;
	}
	public void setCityno(Integer cityno) {
		this.cityno = cityno;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityno=" + cityno + ", cityName=" + cityName + "]";
	}
}
