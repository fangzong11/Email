package com.qf.domain;

public class EmailMsg {
	private String toEmail;//  ’º˛»À
	private String title;
	private String content;

	public EmailMsg() {

	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "EmailMsg [toEmail=" + toEmail + ", title=" + title + ", content=" + content + "]";
	}

}
