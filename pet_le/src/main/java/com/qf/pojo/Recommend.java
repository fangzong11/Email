package com.qf.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Recommend {
	private Integer id;
	private String userIcon;
	private String name;
	private Date time;
	private String imgUrl;

	public Recommend() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Recommend [id=" + id + ", userIcon=" + userIcon + ", name=" + name + ", time=" + time + ", imgUrl="
				+ imgUrl + "]";
	}

}
