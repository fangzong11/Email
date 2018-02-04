package com.qf.test;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.qf.domain.EmailMsg;
import com.qf.util.EmailUtil;

public class Test01 {
	public static void main(String[] args) throws AddressException, IOException, MessagingException {
		EmailMsg emailMsg = new EmailMsg();
		emailMsg.setToEmail("Silverfeathers@163.com");
		emailMsg.setTitle("°Ö°Ö¸øÄãµÄÐÅ");
		emailMsg.setContent("¶ù×Ó£¬½Ð°Ö°Ö");
		EmailUtil.sendEmail(emailMsg);
		System.out.println("=========");
	}
}
