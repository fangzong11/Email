package com.qf.util;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.qf.domain.EmailMsg;

public class EmailUtil {
	private static String email = "fzg528080@163.com";
	private static String pass = "fzg528080";

	public static void sendEmail(EmailMsg emailMsg) throws IOException, AddressException, MessagingException {
		final Properties properties = new Properties();
		properties.load(EmailUtil.class.getClassLoader().getResourceAsStream("mail.properties"));
		Authenticator authenticator = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(properties.getProperty("mail.username"),
						properties.getProperty("mail.password"));
			}
		};
		Session session = Session.getDefaultInstance(properties, authenticator);
		session.setDebug(true);
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(email));
		message.setSubject(emailMsg.getTitle());
		message.setContent(emailMsg.getContent(), "text/html;charset=UTF-8");
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(emailMsg.getToEmail()));
		message.setSentDate(new Date());
		Transport.send(message);
	}
}
