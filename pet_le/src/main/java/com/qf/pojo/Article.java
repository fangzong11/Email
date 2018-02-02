package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Article {
	private Integer id;
	private String iconUrl;
	private String name;
	private String imgUrl;
	private String title;
	private Date time;
	private String title_type;
	private int title_like;
	private int tilte_comment;
	private String content;

	public Article() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_type() {
		return title_type;
	}

	public void setTitle_type(String title_type) {
		this.title_type = title_type;
	}

	public int getTitle_like() {
		return title_like;
	}

	public void setTitle_like(int title_like) {
		this.title_like = title_like;
	}

	public int getTilte_comment() {
		return tilte_comment;
	}

	public void setTilte_comment(int tilte_comment) {
		this.tilte_comment = tilte_comment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", iconUrl=" + iconUrl + ", name=" + name + ", imgUrl=" + imgUrl + ", title="
				+ title + ", time=" + time + ", subName=" + ", title_type=" + title_type + ", title_like="
				+ title_like + ", tilte_comment=" + tilte_comment + ", content=" + content + "]";
	}

}
