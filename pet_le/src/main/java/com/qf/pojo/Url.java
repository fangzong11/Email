package com.qf.pojo;

public class Url {
	private int id;
	private String imgUrl;

	public Url() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Url [id=" + id + ", imgUrl=" + imgUrl + "]";
	}

}
