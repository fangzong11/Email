package com.qf.pojo;

public class Special {
	private Integer id;
	private String imgUrl;
	private String title;
	private String type;
	private Integer messageNum;

	public Special() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMessageNum() {
		return messageNum;
	}

	public void setMessageNum(Integer messageNum) {
		this.messageNum = messageNum;
	}

	@Override
	public String toString() {
		return "Special [id=" + id + ", imgUrl=" + imgUrl + ", title=" + title + ", type=" + type + ", messageNum="
				+ messageNum + "]";
	}

}
