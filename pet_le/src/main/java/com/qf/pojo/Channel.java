package com.qf.pojo;

import java.util.List;

public class Channel {
	private Integer id;
	private String usericon;
	private String username;
	private String lightTitle;
	private String title;
	private int linkNumber;
	private int commentNumber;
	private List<Url> imgUrl;

	public Channel() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsericon() {
		return usericon;
	}

	public void setUsericon(String usericon) {
		this.usericon = usericon;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLightTitle() {
		return lightTitle;
	}

	public void setLightTitle(String lightTitle) {
		this.lightTitle = lightTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLinkNumber() {
		return linkNumber;
	}

	public void setLinkNumber(int linkNumber) {
		this.linkNumber = linkNumber;
	}

	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}

	public List<Url> getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(List<Url> imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Channel [id=" + id + ", usericon=" + usericon + ", username=" + username + ", lightTitle=" + lightTitle
				+ ", title=" + title + ", linkNumber=" + linkNumber + ", commentNumber=" + commentNumber + ", imgUrl="
				+ imgUrl + "]";
	}

}
