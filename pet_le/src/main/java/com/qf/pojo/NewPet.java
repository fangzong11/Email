package com.qf.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NewPet {
	private Integer id;
	private String userIcon;
	private String name;
	private Date time;
	private String imgIcon;
	private String pet_name;

	public NewPet() {

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

	public String getImgIcon() {
		return imgIcon;
	}

	public void setImgIcon(String imgIcon) {
		this.imgIcon = imgIcon;
	}

	public String getPet_name() {
		return pet_name;
	}

	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}

	@Override
	public String toString() {
		return "NewPet [id=" + id + ", userIcon=" + userIcon + ", name=" + name + ", time=" + time + ", imgIcon="
				+ imgIcon + ", pet_name=" + pet_name + "]";
	}

}
